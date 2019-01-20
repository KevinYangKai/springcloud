package com.wonders.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "FEIGN-CONSUMER")
public interface TestService {

    @RequestMapping(value = "/from")
    String from();

}
