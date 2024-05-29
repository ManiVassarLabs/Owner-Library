package com.example.ownerLibrary.controllers;

import com.example.ownerLibrary.propertyConfigs.ApplicationConfig;
import com.example.ownerLibrary.propertyConfigs.ApplicationConfigLoader;
import com.example.ownerLibrary.propertyConfigs.TestingConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    ApplicationConfig applicationConfig;

    @Autowired
    TestingConfig testingConfig;

    @GetMapping("/getapplicationName")
    public String getApplicationName(){
        return "application name is"+ applicationConfig.applicationName();
    }

    @GetMapping("/getTestingDetails")
    public String getTestingDetails(){
        return testingConfig.applicationName()+"::"+testingConfig.version() + "::" +testingConfig.model() +"::"+ testingConfig.role()+"::"+testingConfig.timer();
    }
}
