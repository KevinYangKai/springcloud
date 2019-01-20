package com.wonders.feignconsumer.controller;

import com.wonders.feignconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetFromController {

    @Autowired
    private TestService testService;

    @Value("${from}")
    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from() {
        return this.from;
    }

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String feignConsumer() {
        return testService.from();
    }

}
