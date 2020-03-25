package com.laozhu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    // 向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口

    /**
     * @Author: zhy
     * @date: 2019/11/28
     * @Param:
     * @return:
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
