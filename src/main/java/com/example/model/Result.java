package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * 结果
 *
 * @author DF.
 * @date 2023-05-20 22:09:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Http状态码
     */
    private Integer code;

    /**
     * 返回的状态信息
     */
    private String msg;

    /**
     * 返回的数据对象
     */
    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
