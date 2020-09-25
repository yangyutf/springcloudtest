package com.cloud.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class OpenfeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignApplication.class, args);
    }
}

