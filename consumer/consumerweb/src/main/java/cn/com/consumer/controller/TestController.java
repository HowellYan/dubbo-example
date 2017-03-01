package cn.com.consumer.controller;

import cn.com.consumer.service.Impl.TestService;
import cn.com.provider.request.VerificationRequst;
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
    TestService testService;


    @Bean
    public Action<Chain> index() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","000000");

        return chain -> chain
                .get(ctx ->{

                    VerificationRequst verificationRequst = new VerificationRequst();
                    verificationRequst.setIp("127.0.0.1");
                    verificationRequst.setUserId("123456");
                    verificationRequst.setType(0);

                    ctx.render(testService.verification(verificationRequst).toString());
                });
    }
}
