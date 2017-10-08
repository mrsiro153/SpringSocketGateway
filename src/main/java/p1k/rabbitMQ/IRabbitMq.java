package p1k.rabbitMQ;

import com.rabbitmq.client.Channel;

public interface IRabbitMq {
    IRabbitMq rabbitMqConfig();
    void pushToMq(String message,String queue);
    Channel getChannel();
}
