package com.lyh.consumer.controller;

import com.lyh.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * Created by liubiao on 2020/10/1.
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping (value = "/order/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallBack")
    public User getOrder(@PathVariable Long id){
        //获取数据
        User user = new User();
        user.setId(id);
        user.setDate(new Date());
        user = restTemplate.getForObject("http://provider-user/user/"+id,User.class);
        System.out.println(Thread.currentThread().getId());
        return user;
    }
    public User findByIdFallBack(Long id){
        System.out.println(Thread.currentThread().getId());
        User user = new User();
        user.setId(1L);
        return user;
    }
}
