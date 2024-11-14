package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
////开启注解式事务驱动
@EnableTransactionManagement
//开启aop功能
@EnableAspectJAutoProxy
//开启json数据类型自动转换
//@EnableWebMvc
//扫描dao接口
@MapperScan("com.example.dao")
public class LostApplication {

    public static void main(String[] args) {
        SpringApplication.run(LostApplication.class, args);
    }

}
