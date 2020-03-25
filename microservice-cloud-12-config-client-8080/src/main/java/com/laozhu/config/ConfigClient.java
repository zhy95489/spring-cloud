package com.laozhu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {

    //会从git中的microservice-config-application.yml中获取
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    //请求访问
    @GetMapping("/config")
    public String getConfig() {
        String content = "applicationName:" + applicationName + ",port" + port;
        System.out.println("content:" + content);
        return content;
    }
}
