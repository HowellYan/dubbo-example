package cn.com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.service.EchoService;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Service(version = "1.0.0")
@Slf4j
public class EchoServerImpl implements EchoService {
    @Override
    public Object $echo(Object o) {
        System.out.println(o);
        log.info("EchoServerImpl:"+o);

        return "{'ok':'000000'}";
    }

}

