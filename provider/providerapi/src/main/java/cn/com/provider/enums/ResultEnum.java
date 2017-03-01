package cn.com.provider.enums;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
public enum ResultEnum {
    SUCCESS("000000", "成功"),
    WRONG("999999", "未知错误");
    private String resultCode;

    private String resultDesc;

    ResultEnum(String resultCode, String resultDesc) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

}
