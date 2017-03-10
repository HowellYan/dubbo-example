package cn.com.provider.service;

import cn.com.commons.response.CommonResponse;
import cn.com.provider.Dao.Bean.UserDao;
import cn.com.provider.Dao.Model.UserModel;
import cn.com.provider.enums.ResultEnum;
import cn.com.provider.integration.Verification.VerificationLoginService;
import cn.com.provider.request.VerificationRequst;
import cn.com.provider.response.VerificationResponse;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
@Service
@Slf4j
public class VerificationServiceImpl implements VerificationService {

    @Autowired
    VerificationLoginService verificationLoginService;

    @Autowired
    private UserDao userDao;

    @Override
    public CommonResponse<VerificationResponse> verification(VerificationRequst request) {
        CommonResponse response = new CommonResponse();

        log.info("VerificationRequst:"+request.toString());

        List<UserModel>  userModelList = userDao.findAll();


        VerificationResponse verificationResponse = new VerificationResponse();
        response.setResultCode(ResultEnum.SUCCESS.getResultCode());
        response.setResultDesc(ResultEnum.SUCCESS.getResultDesc());
        verificationResponse.setLocking(verificationLoginService.verification());
        if ( userModelList != null && userModelList.size() > 0){
            UserModel userModel = userModelList.get(0);
            verificationResponse.setU_id(userModel.getU_id());
            verificationResponse.setU_name(userModel.getU_name());
            verificationResponse.setU_phone(userModel.getU_phone());
        }

        response.setResult(verificationResponse);
        return response;
    }
}
