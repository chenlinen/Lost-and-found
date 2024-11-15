package com.example.util;


import com.example.enums.CodeEnum;
import com.example.model.Result;

/**
 * 结果工具类
 *
 * @author DF.
 * @date 2023-05-20 22:22:17
 */
public class ResultUtil<T> {

    /**
     * 默认成功(不带对象)
     */
    public static <T> Result<T> success(){
        return new Result<T>(CodeEnum.SUCCESS.getCode(),CodeEnum.SUCCESS.getMsg());
    }

    /**
     * 默认成功(带对象)
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(CodeEnum.SUCCESS.getCode(),CodeEnum.SUCCESS.getMsg(),data);
    }

    /**
     * 自定义信息(不带对象)
     */
    public static <T> Result<T> success(String msg){
        return new Result<T>(CodeEnum.SUCCESS.getCode(),msg);
    }

    /**
     * 自定义状态码,信息(不带对象)
     */
    public static <T> Result<T> success(Integer code,String msg){
        return new Result<T>(code,msg);
    }

    /**
     * 自定义状态码,信息(带对象)
     */
    public static <T> Result<T> success(Integer code,String msg,T data){
        return new Result<T>(code,msg,data);
    }

    /**
     * 自定义状态码,对象(msg:成功)
     */
    public static <T> Result<T> success(Integer code,T data){
        return new Result<T>(code, CodeEnum.SUCCESS.getMsg(),data);
    }

    /**
     * 自定义状态码,对象(code:200)
     */
    public static <T> Result<T> success(String msg,T data){
        return new Result<T>(CodeEnum.SUCCESS.getCode(),msg,data);
    }

    /**
     * 默认失败
     */
    public static <T> Result<T> error(){
        return new Result<T>(CodeEnum.ERROR.getCode(),CodeEnum.ERROR.getMsg());
    }

    /**
     * 自定义状态码和信息
     */
    public static <T> Result<T> error(Integer code,String msg){
        return new Result<T>(code,msg);
    }

    /**
     * 自定义信息(code:100)
     */
    public static <T> Result<T> error(String msg){
        return new Result<T>(CodeEnum.ERROR.getCode(),msg);
    }

    /**
     * 自定义状态码(msg:错误)
     */
    public static <T> Result<T> error(Integer code){
        return new Result<T>(code,CodeEnum.ERROR.getMsg());
    }

    /**
     * 默认404异常
     */
    public static <T> Result<T> nullError(){
        return error(CodeEnum.NULL_POINT.getCode(),CodeEnum.NULL_POINT.getMsg());
    }

}
