package p1k.rabbitMQ;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import p1k.exception.SocketException;

import java.io.IOException;

@Configuration
public class RabbitMq implements IRabbitMq{

    private Channel channel;

    @Override
    @Bean
    public IRabbitMq rabbitMqConfig(){
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("server02.ntex.vn");
            factory.setPort(5672);
            factory.setUsername("doannh");
            factory.setPassword("moonrider");
            factory.setVirtualHost("doanNH");
            factory.setConnectionTimeout(10000);
            factory.setAutomaticRecoveryEnabled(true);
            Connection connection = factory.newConnection();
            channel = connection.createChannel();
        }catch (Exception e){
            throw new SocketException.ConnectMqException("Can not Connect to MQ");
        }
        return this;
    }

    @Override
    public void pushToMq(String message, String queue) {
        try {
            channel.basicPublish("", queue, null, message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Channel getChannel() {
        return channel;
    }
}
