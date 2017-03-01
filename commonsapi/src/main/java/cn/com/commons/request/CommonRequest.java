package cn.com.commons.request;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
public class CommonRequest implements Serializable {
    private static final long serialVersionUID = -7925208330716528948L;
    @NotBlank(
            message = "请求流水不能为空"
    )
    private String keep;

    public CommonRequest() {

    }

    public String getKeep() {
        return this.keep;
    }

    public void setKeep(String keep) {
        this.keep = keep;
    }
}