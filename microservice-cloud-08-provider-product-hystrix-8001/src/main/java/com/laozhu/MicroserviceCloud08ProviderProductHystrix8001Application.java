package com.laozhu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableSwagger2Doc
@EnableEurekaClient
@MapperScan("com.laozhu.mapper")
public class MicroserviceCloud08ProviderProductHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud08ProviderProductHystrix8001Application.class, args);
    }

}
