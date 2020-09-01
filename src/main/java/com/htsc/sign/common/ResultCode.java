package com.htsc.sign.common;

/**
 * created by Kimone
 * date 2020/9/1
 */
public enum ResultCode {
    SUCCESS(200), NOT_ACCESS(204), ERROR(400), NOT_FOUND(404);

    private int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}