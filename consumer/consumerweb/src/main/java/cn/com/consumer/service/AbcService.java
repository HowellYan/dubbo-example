package cn.com.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Component
public class AbcService {

    @Reference(version = "1.0.0")
    public EchoService echoService;
}