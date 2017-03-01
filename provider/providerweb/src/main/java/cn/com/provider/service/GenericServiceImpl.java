package cn.com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Service
@Slf4j
public class GenericServiceImpl implements GenericService {
    @Override
    public Object $invoke(String s, String[] strings, Object[] objects) throws GenericException {
        System.out.println(s);
        log.info("GenericServiceImpl:"+s);

        return "{'ok':'000000'}";
    }
}
