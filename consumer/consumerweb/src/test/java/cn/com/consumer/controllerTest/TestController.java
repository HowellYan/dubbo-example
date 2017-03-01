package cn.com.consumer.controllerTest;

import cn.com.commons.response.CommonResponse;
import cn.com.consumer.base.BaseTest;
import cn.com.consumer.service.Impl.TestService;
import cn.com.provider.request.VerificationRequst;
import cn.com.provider.response.VerificationResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
@Slf4j
public class TestController extends BaseTest {


//    @MockBean
//    TestService testService;

    @Autowired
    TestService service;


    @Override
    public void fullMockInner() {

    }

    /**
     * Mock
     */
    @Test
    public void testIndexController() {
        CommonResponse<VerificationResponse> verificationResponseCommonResponse = new CommonResponse<VerificationResponse>();
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setLocking(true);
        verificationResponseCommonResponse.setResult(verificationResponse);
        verificationResponseCommonResponse.setResultCode("000000");

        VerificationRequst verificationRequst = new VerificationRequst();
        verificationRequst.setIp("127.0.0.1");
        verificationRequst.setUserId("AAAAAAAAAAA");
        verificationRequst.setType(0);

        given(service.verification(verificationRequst)).willReturn(verificationResponseCommonResponse);

        assertThat(service.verification(verificationRequst)).isEqualTo(verificationResponseCommonResponse);

    }

    /**
     * 非Mock
     */
    @Test
    public void testIndexNController() {
        VerificationRequst verificationRequst = new VerificationRequst();
        verificationRequst.setIp("127.0.0.1");
        verificationRequst.setUserId("123456");
        verificationRequst.setType(0);
        CommonResponse<VerificationResponse> response = service.verification(verificationRequst);

        Assert.assertEquals("000000", response.getResultCode());

    }


}
