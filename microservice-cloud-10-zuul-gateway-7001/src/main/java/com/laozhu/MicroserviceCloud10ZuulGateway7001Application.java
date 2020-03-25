package com.laozhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class MicroserviceCloud10ZuulGateway7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud10ZuulGateway7001Application.class, args);
    }

}

