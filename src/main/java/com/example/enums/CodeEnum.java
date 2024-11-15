package com.example.enums;

/**
 * 枚举状态码
 *
 * @author DF.
 * @date 2023-05-20 21:50:50
 */
public enum CodeEnum {

    //100开头都是错误消息
    ERROR(100, "error"),
    //200开头都是成功消息
    SUCCESS(200, "success"),

    //不存在异常
    NULL_POINT(404,"你所访问的不存在"),
    //客户端异常
    CLIENT_ERROR(400,"客户端异常"),
    //服务器异常
    SERVER_ERROR(500,"服务端异常"),
    //未登录异常
    UNAUTHORIZED(101, "暂未登录或token已经过期");

    private final Integer code;
    private final String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}