package com.lyh.provider.controller;

import com.lyh.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Administrator on 2020/10/1.
 */
@RestController
public class UserController {
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
}
