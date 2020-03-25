package com.laozhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard//开启服务监控
@SpringBootApplication
public class MicroserviceCloud09HystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud09HystrixDashboard9001Application.class, args);
    }

}
