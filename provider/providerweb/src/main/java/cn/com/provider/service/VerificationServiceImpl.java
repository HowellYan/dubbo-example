package cn.com.provider.service;

import cn.com.commons.response.CommonResponse;
import cn.com.provider.enums.ResultEnum;
import cn.com.provider.integration.Verification.VerificationLoginService;
import cn.com.provider.request.VerificationRequst;
import cn.com.provider.response.VerificationResponse;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
@Service
@Slf4j
public class VerificationServiceImpl implements VerificationService {

    @Autowired
    VerificationLoginService verificationLoginService;

    @Override
    public CommonResponse<VerificationResponse> verification(VerificationRequst request) {
        CommonResponse response = new CommonResponse();

        log.info("VerificationRequst:"+request.toString());

        VerificationResponse verificationResponse = new VerificationResponse();
        response.setResultCode(ResultEnum.SUCCESS.getResultCode());
        response.setResultDesc(ResultEnum.SUCCESS.getResultDesc());
        verificationResponse.setLocking(verificationLoginService.verification());

        response.setResult(verificationResponse);
        return response;
    }
}
