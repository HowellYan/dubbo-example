package cn.com.consumer.controller;

import cn.com.consumer.service.AbcService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import ratpack.func.Action;
import ratpack.handling.Chain;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Controller
@Slf4j
public class TestController {

    @Autowired
    AbcService abcService;

    @Bean
    public Action<Chain> index() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","000000");

        return chain -> chain
                .get(ctx ->{
                    Object object = abcService.echoService.$echo("asdasd");
                    System.out.println(object);
                    ctx.render(jsonObject.toString());
                });
    }
}
