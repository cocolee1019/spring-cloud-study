package org.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order/getHello")
    public String orderHello() {
        //TODO eureka客户端之间如何调用服务?
        String forObject = restTemplate.getForObject("http://EUREKACLIENTPAYMENT9000/hello", String.class);
        return forObject;
    }
}
