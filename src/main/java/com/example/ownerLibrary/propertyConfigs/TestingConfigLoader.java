package com.example.ownerLibrary.propertyConfigs;

import org.aeonbits.owner.ConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestingConfigLoader {

    @Bean
    public TestingConfig testingConfig(){
        return ConfigFactory.create(TestingConfig.class);
    }

}
