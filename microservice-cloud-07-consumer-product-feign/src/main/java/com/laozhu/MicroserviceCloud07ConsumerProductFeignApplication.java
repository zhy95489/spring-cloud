package com.laozhu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.laozhu"})
@EnableSwagger2Doc
public class MicroserviceCloud07ConsumerProductFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud07ConsumerProductFeignApplication.class, args);
    }

}
