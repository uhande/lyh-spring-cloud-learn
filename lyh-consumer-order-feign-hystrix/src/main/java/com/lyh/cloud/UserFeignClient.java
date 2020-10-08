package com.lyh.cloud;

import com.lyh.cloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignClient {
    @RequestMapping (value = "/user/{id}", method = RequestMethod.GET)
    User getUser(@PathVariable Long id);
}
