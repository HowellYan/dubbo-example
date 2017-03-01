package cn.com.consumer.aop;

import cn.com.commons.response.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
@Component
@Aspect
@Slf4j
public class ReqAspect {

    @Around(value = "execution(* cn.com.consumer.service..*.*(..))")
    public Object getBaseDataAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] params = joinPoint.getArgs();
        boolean errflag = false;
        StringBuilder errMsg = new StringBuilder("参数校验错误:");
        for (Object param : params) {
            log.info(param.toString());
        }
        if (errflag) {
            CommonResponse response = new CommonResponse();
            response.setResultCode("999999");
            response.setResultDesc(errMsg.toString());
            return response;
        }
        return joinPoint.proceed();
    }
}
