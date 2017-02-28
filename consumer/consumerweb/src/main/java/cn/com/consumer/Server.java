package cn.com.consumer;


import cn.com.consumer.settings.Ratpack.StartRatpack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@SpringBootApplication
@StartRatpack
@ComponentScan({
        "cn.com.consumer"
})
public class Server {

    public static void main(String[] args) {


        SpringApplication.run(Server.class, args);
    }
}
