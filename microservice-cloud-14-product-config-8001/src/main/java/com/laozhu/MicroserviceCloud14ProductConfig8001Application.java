package com.laozhu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
@MapperScan("com.laozhu.mapper")
public class MicroserviceCloud14ProductConfig8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud14ProductConfig8001Application.class, args);
    }

}
