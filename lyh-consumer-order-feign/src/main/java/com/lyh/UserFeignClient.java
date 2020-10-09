package com.lyh;

import com.lyh.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "provider-user")
public interface UserFeignClient {
    @RequestMapping (value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id);
    @RequestMapping (value = "/user", method = RequestMethod.POST)
    public User postUser(@RequestBody User user);
}
