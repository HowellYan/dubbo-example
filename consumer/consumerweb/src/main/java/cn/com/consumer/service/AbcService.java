package cn.com.consumer.service;

import cn.com.provider.service.VerificationService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.stereotype.Component;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Component
public class AbcService {

    @Reference
    public EchoService echoService;

    @Reference
    public GenericService genericService;

    @Reference
    public VerificationService verificationService;
}