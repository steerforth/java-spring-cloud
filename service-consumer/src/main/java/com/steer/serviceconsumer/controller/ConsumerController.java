package com.steer.serviceconsumer.controller;

import com.steer.serviceconsumer.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private HelloServiceImpl service;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return service.hello(name);
    }


    @RequestMapping("/hello2/{name}")
    public String hello2(@PathVariable("name") String name) {
        return service.hello2(name);
    }
}
