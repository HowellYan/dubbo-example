package cn.com.commons.Utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by Howell on 1/3/17.
 * e-mail:th15817161961@gmail.com
 */
public class GetString {
    /**
     * 请求流水
     * @return
     */
    public static String getKeep(){
        return System.currentTimeMillis() + RandomStringUtils.randomNumeric(6);
    }
}
