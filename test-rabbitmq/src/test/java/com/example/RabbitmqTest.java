package com.example;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Liq
 * @date 2019/8/19
 */
public class RabbitmqTest {

    public static void main(String[] args) {

        System.out.println("fuck");
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        Connection connection = null;
        Channel channel = null;

        try {
            connection = connectionFactory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare("ququ001",true,false,false,null);
            String message = "hello world";
            channel.basicPublish("","queue001",null,message.getBytes());
            System.out.println("send to mq");
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }

    }

}
