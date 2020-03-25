package com.laozhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceCloud13EurekaConfig6001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud13EurekaConfig6001Application.class, args);
    }

}
