package cn.com.consumer.service.Impl;

import cn.com.commons.response.CommonResponse;
import cn.com.consumer.service.ProviderService;
import cn.com.provider.request.VerificationRequst;
import cn.com.provider.response.VerificationResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
@Service
@Slf4j
public class TestService {
    @Autowired
    ProviderService providerService;

    public CommonResponse<VerificationResponse> verification(VerificationRequst verificationRequst) {
        log.info(verificationRequst.getUserId());
        return providerService.verificationService.verification(verificationRequst);
    }

}
