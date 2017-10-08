package p1k.consumer;

import com.rabbitmq.client.*;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import p1k.constant.QueueKeys;
import p1k.exception.SocketException;
import p1k.rabbitMQ.IRabbitMq;
import p1k.service.ISocketService;
import p1k.service.ITestSocketService;

import java.io.IOException;

@Component
public class ConsumerImpl implements IConsumer {
    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private IRabbitMq rabbitMq;
    private ISocketService socketService;
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    private ITestSocketService testSocketService;



    @Autowired
    public ConsumerImpl(IRabbitMq rabbitMq,
                        ISocketService socketService,
                        ThreadPoolTaskExecutor threadPoolTaskExecutor,
                        ITestSocketService testSocketService) {
        this.rabbitMq=rabbitMq;
        this.socketService=socketService;
        this.threadPoolTaskExecutor=threadPoolTaskExecutor;
        this.testSocketService = testSocketService;
    }

    @Override
    public void usingMQ() {
        handleMessage(QueueKeys.Socket_Queue.SOCKET_WEB_QUEUE);
        handleMessage(QueueKeys.Socket_Queue.DIRECT_SOCKET_WEB_QUEUE);
        handleMessage(QueueKeys.Socket_Queue.TEST_SOCKET_QUEUE);
        LOGGER.info("start Socket success");
    }


    public void handleMessage(QueueKeys.Socket_Queue Queue) {
        try {
            Channel channel = rabbitMq.getChannel();
            channel.queueDeclare(Queue.getValue(), false, false, false, null);
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    threadPoolTaskExecutor.execute(() -> {//open new thread
                        switch (Queue) {
                            case SOCKET_WEB_QUEUE:
                                socketService.handleSendMessageToFrontEnd(message);
                                break;
                            case DIRECT_SOCKET_WEB_QUEUE:
                                LOGGER.debug("DIRECT QUEUE: "+message);
                                break;
                            case TEST_SOCKET_QUEUE:
                                testSocketService.handleMessage("TEST SOCKET: "+message);
                                break;
                            default:
                                throw new SocketException.UnknownAction("action is unknown");
                        }
                    });

                }
            };
            channel.basicConsume(Queue.getValue(), true, consumer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
