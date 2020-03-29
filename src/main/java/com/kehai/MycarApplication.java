package com.kehai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.kehai.mapper")
//@ServletComponentScan(basePackages ="com.kehai.config")
public class MycarApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycarApplication.class, args);
    }

}
