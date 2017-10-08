package p1k;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import p1k.consumer.IConsumer;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Application a = context.getBean(Application.class);
        a.startConsumer();

    }
    private IConsumer consumer;

    @Autowired
    public Application(IConsumer consumer){
        this.consumer=consumer;
    }

    public void startConsumer() {
        consumer.usingMQ();
    }

}
