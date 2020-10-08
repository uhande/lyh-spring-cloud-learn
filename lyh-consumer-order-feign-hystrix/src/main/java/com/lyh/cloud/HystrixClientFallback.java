package com.lyh.cloud;

import com.lyh.cloud.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient{
    @Override
    public User getUser(Long id) {
        System.out.println(Thread.currentThread().getId());
        User user = new User();
        user.setId(1L);
        return user;
    }
}
