package cn.com.consumer.controller;

import cn.com.commons.response.CommonResponse;
import cn.com.consumer.service.AbcService;
import cn.com.provider.request.VerificationRequst;
import cn.com.provider.response.VerificationResponse;
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
//                    Object object = abcService.echoService.$echo("asdasd");
//                    System.out.println(object);
//                    Object a = abcService.genericService.$invoke("asd",null,null);
//                    System.out.println(a);

                    VerificationRequst verificationRequst = new VerificationRequst();
                    verificationRequst.setIp("127.0.0.1");
                    verificationRequst.setUserId("123456");
                    verificationRequst.setKeep("1234567894556123");
                    verificationRequst.setType(0);
                    CommonResponse<VerificationResponse> commonResponse = abcService.verificationService.verification(verificationRequst);

                    System.out.println(commonResponse.toString());
                    ctx.render(jsonObject.toString());
                });
    }
}
