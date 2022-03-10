package com.example.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    public AppConfig() {
        System.out.println("### AppConfig()");
    }

    @Bean
    @Lazy
    public RestTemplate restTemplateBean() {
        System.out.println("### AppConfig.restTemplateBean()");
        return new RestTemplate();
    }

    @Bean
    public String defaultString() {
        System.out.println("### AppConfig.defaultString()");
        String appName = "SPRING-CONSUMER";
        return appName;
    }

}
