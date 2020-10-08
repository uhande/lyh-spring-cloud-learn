package com.lyh.cloud.consumer.controller;

import com.lyh.cloud.UserFeignClient;
import com.lyh.cloud.UserFeignNotHystrixClient;
import com.lyh.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liubiao on 2020/10/1.
 */
@RestController
public class OrderFeignController {
    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private UserFeignNotHystrixClient userFeignNotHystrixClient;
    @GetMapping (value = "/order/{id}")
    public User getUser(@PathVariable Long id){
        //获取数据
        return userFeignClient.getUser(id);
    }

    /**
     * 测试Feign客户端单独控制
     * @param id
     * @return
     */
    @GetMapping(value = "/user/{id}")
    public User getUserNotHystrix(@PathVariable Long id){
        //获取数据
        return userFeignNotHystrixClient.getUserNotHystrix(id);
    }
}
