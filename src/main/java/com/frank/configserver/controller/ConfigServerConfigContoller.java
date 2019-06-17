package com.frank.configserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigServerConfigContoller {
    @Autowired
    private Environment environment;
    @Value("spring.application.name")
    private String originService;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/key")
    public String getConfigByKey(){
        return environment.getProperty("name");
    }

}
