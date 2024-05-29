package com.example.ownerLibrary.propertyConfigs;

import org.aeonbits.owner.ConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigLoader {

    @Bean
    public ApplicationConfig applicationConfig(){
        return ConfigFactory.create(ApplicationConfig.class);
    }
}
