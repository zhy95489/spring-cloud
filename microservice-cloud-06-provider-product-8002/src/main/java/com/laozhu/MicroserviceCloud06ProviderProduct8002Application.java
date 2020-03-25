package com.laozhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.laozhu.mapper")
public class MicroserviceCloud06ProviderProduct8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud06ProviderProduct8002Application.class, args);
    }

}
