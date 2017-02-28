package cn.com.provider.request;

import cn.com.commons.request.CommonRequest;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by susie on 2017/2/28.
 */
@Data
@ToString
public class VerificationRequst extends CommonRequest implements Serializable {
    /**
     * 1 ：登录密码
     * 2 ：支付密码
     */
    @NotBlank(
            message = "验证类型不能为空"
    )
    int type;

    /**
     * 手机号、或者邮箱
     */
    @NotBlank(
            message = "用户id不能为空"
    )
    @Min(value = 8)
    @Max(value = 255)
    String userId;

    /**
     * 用户设备Mac地址
     */
    @Null
    @Max(value = 255)
    String mac;

    /**
     * 用户设备ip地址
     */
    @Null
    @Max(value = 255)
    String ip;

    /**
     * 用户设备端口
     */
    @Null
    @Max(value = 255)
    String port;
}
