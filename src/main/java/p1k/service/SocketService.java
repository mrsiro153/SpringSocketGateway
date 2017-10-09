package p1k.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p1k.common.CommonResponse;
import p1k.common.IValidationRequest;
import p1k.rabbitMQ.IRabbitMq;
import p1k.socket.SocketHandler;

import java.util.Date;

@Service
public class SocketService implements ISocketService {
    Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    private IRabbitMq rabbitMq;
    private SocketHandler socketHandler;
    private IValidationRequest validationRequest;
    private Gson gson;

    @Autowired
    public SocketService(IRabbitMq rabbitMq
                         ,SocketHandler socketHandler,
                         IValidationRequest validationRequest,
                         Gson gson) {
        this.rabbitMq=rabbitMq;
        this.socketHandler=socketHandler;
        this.validationRequest= validationRequest;
        this.gson = gson;
    }

    @Override
    public void handleSendMessageToFrontEnd(String message) {
        LOGGER.info("start handle send message to front end");
        try {
            CommonResponse response = validationRequest.checkAuth(message).setType();
            response=validationRequest.handleMessage(response);
            response.setTime(new Date().getTime()).setCollationId(response.getHeader().getCollationId() != null ? response.getHeader().getCollationId() : response.getHeader().getSocketID().replaceAll("-", ""));
            JsonObject json = new JsonParser().parse(new Gson().toJson(response)).getAsJsonObject();
            json.remove("header");
            socketHandler.sendToSocket(response.getHeader().getSocketID(),json.toString());
            LOGGER.info("Send message success to channel: {}",response.getHeader().getSocketID());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void handleSendMessageDirectToFrontEnd(String message) {
        LOGGER.info("start handle send message DIRECT to front end");
        try{
            CommonResponse response = gson.fromJson(message, CommonResponse.class);
            response.setTime(new Date().getTime()).setCollationId(response.getHeader().getCollationId() != null ? response.getHeader().getCollationId() : response.getHeader().getSocketID().replaceAll("-", ""));
            response.setType();
            JsonObject json = new JsonParser().parse(new Gson().toJson(response)).getAsJsonObject();
            json.remove("header");
            socketHandler.sendToSocket(response.getHeader().getSocketID(),json.toString());
            LOGGER.info("handle send direct message success!");
        }catch (Exception e){
            LOGGER.error("Error: {}",e.toString());
        }
    }
}
