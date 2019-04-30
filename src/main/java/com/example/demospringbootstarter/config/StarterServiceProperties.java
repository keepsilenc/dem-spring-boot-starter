package com.example.demospringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
* 配置文件读取类
* */
@ConfigurationProperties("com.example.demospringbootstarter")
public class StarterServiceProperties {
    private String config;

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
