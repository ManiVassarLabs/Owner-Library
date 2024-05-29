package com.example.ownerLibrary.propertyConfigs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:application.properties")
public interface ApplicationConfig extends Config {

    @Key("spring.application.name")
    String applicationName();
}
