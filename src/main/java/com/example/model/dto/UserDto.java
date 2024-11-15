package com.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    /**
     * 个人简介
     */
    private String profile;
    /**
     * 身份 1 学生 2 老师
     */
    private Integer userRole;
    /**
     * 性别 1 男 2 女
     */
    private Integer sex;
    /**
     * 学院名
     */
    private String academy;
}
