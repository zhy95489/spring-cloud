package com.laozhu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableSwagger2Doc
@EnableEurekaClient
@MapperScan("com.laozhu.mapper")
public class MicroserviceCloud03ProviderProduct8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud03ProviderProduct8001Application.class, args);
    }

}
