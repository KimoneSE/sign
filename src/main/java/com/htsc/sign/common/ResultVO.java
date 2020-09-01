package com.htsc.sign.common;

/**
 * created by Kimone
 * date 2020/9/1
 */

public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultVO() {
        this.code = ResultCode.SUCCESS.getCode();
        this.message = "success";
        this.data = null;
    }

    public ResultVO(T data) {
        this.code = ResultCode.SUCCESS.getCode();
        this.message = "success";
        this.data = data;
    }

    public ResultVO(String message) {
        this.code = ResultCode.ERROR.getCode();
        this.message = message;
    }

    public ResultVO(ResultCode code, String message) {
        this.code = code.getCode();
        this.message = message;
    }

    public ResultVO(ResultCode code, String message, T data) {
        this.code = code.getCode();
        this.message = message;
        this.data = data;
    }
}

