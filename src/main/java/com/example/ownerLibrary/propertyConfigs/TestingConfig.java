package com.example.ownerLibrary.propertyConfigs;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:testing.properties","file:~/testing.config"})
public interface TestingConfig extends Config {

    @Key("version")
    String version();

    @Key("model")
    String model();

    @Key("role")
    String role();

    @Key("timer")
    @DefaultValue("23") // default value
    String timer();

    @Key("testCases")
    String testCases();

    @Key("spring.application.name")
    String applicationName();

}
