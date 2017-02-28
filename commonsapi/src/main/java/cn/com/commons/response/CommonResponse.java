package cn.com.commons.response;

import java.io.Serializable;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
public class CommonResponse<T> implements Serializable {
    private T result;
    /**
     * 响应编码
     */
    private String resultCode;
    /**
     * 响应描述
     */
    private String resultDesc;

    public CommonResponse() {
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String toString() {
        return "CommonResponse{result=" + this.result + ", resultCode=\'" + this.resultCode + '\'' + ", resultDesc=\'" + this.resultDesc + '\'' + '}';
    }
}
