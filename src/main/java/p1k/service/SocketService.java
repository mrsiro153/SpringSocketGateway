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
import p1k.constant.QueueKeys;
import p1k.rabbitMQ.IRabbitMq;
import p1k.socket.SocketHandler;

import java.util.Date;

@Service
public class SocketService implements ISocketService {
    Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    private IRabbitMq rabbitMq;
    private SocketHandler socketHandler;
    private IValidationRequest validationRequest;

    @Autowired
    public SocketService(IRabbitMq rabbitMq
                         ,SocketHandler socketHandler,
                         IValidationRequest validationRequest) {
        this.rabbitMq=rabbitMq;
        this.socketHandler=socketHandler;
        this.validationRequest= validationRequest;
    }

    @Override
    public void handleSendMessageToFrontEnd(String message) {
        try {
            CommonResponse response = validationRequest.checkAuth(message).setType();
            response=validationRequest.handleMessage(response);
            response.setTime(new Date().getTime()).setCollationId(response.getHeader().getCollationId() != null ? response.getHeader().getCollationId() : response.getHeader().getSocketID().replaceAll("-", ""));
            JsonObject json = new JsonParser().parse(new Gson().toJson(response)).getAsJsonObject();
            json.remove("header");
            socketHandler.sendToSocket(response.getHeader().getSocketID(),json.toString());
            LOGGER.info("Send message success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
