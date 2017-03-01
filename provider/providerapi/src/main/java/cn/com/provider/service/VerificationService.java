package cn.com.provider.service;

import cn.com.commons.response.CommonResponse;
import cn.com.provider.request.VerificationRequst;
import cn.com.provider.response.VerificationResponse;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
public interface VerificationService {
    /**
     * 密码验证
     * @param request
     * @return
     */
    CommonResponse<VerificationResponse> verification(VerificationRequst request);
}
