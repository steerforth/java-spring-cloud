package com.steer.serviceconsumer.template;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "steer-service-provider")
public interface ProducerClient {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
