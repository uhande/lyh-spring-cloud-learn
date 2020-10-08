package com.lyh.consumer.controller;

import com.lyh.UserFeignClient;
import com.lyh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * Created by liubiao on 2020/10/1.
 */
@RestController
public class OrderFeignController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping (value = "/user/{id}")
    public User getUser(@PathVariable Long id){
        //获取数据
        return this.userFeignClient.getUser(id);
    }
    @GetMapping (value = "/user")
    public User postUser(User user){
        return this.userFeignClient.postUser(user);
    }
}
