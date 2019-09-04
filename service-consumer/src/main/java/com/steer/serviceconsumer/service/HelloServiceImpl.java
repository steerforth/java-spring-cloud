package com.steer.serviceconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.steer.serviceconsumer.template.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl {
    @Autowired
    private ProducerClient client;


    public String hello(String name){
        return client.hello(name);
    }

    public String myFallback(String name,Throwable t){
        return "fall back:i am Hystrix from service,req="+name+" reason="+t;
    }

    @HystrixCommand(fallbackMethod = "myFallback",commandKey="hello",groupKey="helloGroup",
            threadPoolKey="helloThread")
    public String hello2(String name) {
        int i = 1/0;
        return "1111";
    }
}
