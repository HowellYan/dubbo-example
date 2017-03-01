package cn.com.provider.response;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@Data
public class VerificationResponse implements Serializable {

    /**
     * 锁定
     */
    boolean locking;
}
