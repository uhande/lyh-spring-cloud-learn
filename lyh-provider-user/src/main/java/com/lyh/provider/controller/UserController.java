package com.lyh.provider.controller;

import com.lyh.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Administrator on 2020/10/1.
 */
@RestController
@RefreshScope
public class UserController {
    @Value("${profile}")
    private String profile;

    @GetMapping (value = "/user/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setDate(new Date());
        return user;
    }
    @PostMapping (value = "/user")
    public User getPostUser(@RequestBody User user){
        return user;
    }

    @GetMapping (value = "/profile")
    public String getProfile(){
       return this.profile;
    }
}
