package com.cloud.openfeignlient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(basePackages = "com.cloud.openfeignlient")
@SpringBootApplication
public class OpenfeignlientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignlientApplication.class, args);
    }

}
