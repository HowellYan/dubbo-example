package cn.com.provider.controller;


import lombok.extern.slf4j.Slf4j;
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
public class IndexController {
    @Bean
    public Action<Chain> index() {
        return chain -> chain
                .get(ctx ->{
                    ctx.render("Provider service is running.");
                });
    }
}
