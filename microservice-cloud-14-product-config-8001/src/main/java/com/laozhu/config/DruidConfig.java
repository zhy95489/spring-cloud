package com.laozhu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhy
 * @date 2019/12/12 11:24
 */
//一定不要在此类加@RefreshScope，不然报错
@Configuration //不要少了
public class DruidConfig {
    @RefreshScope //刷新数据源
    @ConfigurationProperties(prefix = "spring.datasource") //绑定数据源配置
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }
}