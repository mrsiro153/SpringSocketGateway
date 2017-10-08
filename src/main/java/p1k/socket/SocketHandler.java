package p1k.socket;

import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class SocketHandler extends TextWebSocketHandler {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    List sessions = new CopyOnWriteArrayList();
    Map<String, WebSocketSession> m = new HashMap<>();


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);
        m.put(session.getUri().toString(), session);
        JsonObject js = new JsonObject();
        js.addProperty("session", session.getId());
        js.addProperty("channel", session.getUri().toString());
        session.sendMessage(new TextMessage(js.toString()));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        if (message.getPayload().equals("ping")) {
            session.sendMessage(new TextMessage("pong"));
            return;
        }
        LOGGER.debug("URI: " + session.getUri() + " Message: " + message.getPayload());
        session.sendMessage(new TextMessage("Hello " + message.getPayload() + " !"));
    }

    //
    public void sendAllSocket() throws IOException {
        for (Object s : sessions) {
            WebSocketSession session = (WebSocketSession) s;
            session.sendMessage(new TextMessage("hello"));
        }
    }

    //
    public void sendAllSocket(String message) throws IOException {
        for (Object s : sessions) {
            WebSocketSession session = (WebSocketSession) s;
            session.sendMessage(new TextMessage(message));
        }
    }

    //
    public void sendToSocket(Integer number) {
        try {
            WebSocketSession s = (WebSocketSession) sessions.get(number);
            s.sendMessage(new TextMessage("hello world!"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void sendToSocket(String path,String message) {
        for (Object s : sessions) {
            WebSocketSession session = (WebSocketSession) s;
            if (path.equals(session.getUri().toString())) {
                try {
                    session.sendMessage(new TextMessage(message));
                    LOGGER.info("send success at :" + new Date() + " with channel: " + session.getUri().toString());
                } catch (Exception e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
        //
    }

}
