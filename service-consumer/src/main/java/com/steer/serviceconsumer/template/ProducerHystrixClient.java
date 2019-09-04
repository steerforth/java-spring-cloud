package com.steer.serviceconsumer.template;

import org.springframework.stereotype.Component;

@Component
public class ProducerHystrixClient implements ProducerClient{

    public String hello(String name) {
        return "i am hystrix from feign interface";
    }
}
