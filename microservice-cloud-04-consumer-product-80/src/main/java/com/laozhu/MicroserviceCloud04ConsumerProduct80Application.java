package com.laozhu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableSwagger2Doc
@EnableEurekaClient
public class MicroserviceCloud04ConsumerProduct80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud04ConsumerProduct80Application.class, args);
    }

}
