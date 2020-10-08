package com.lyh.cloud;

import com.lyh.cloud.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientNotHystrixFallback implements UserFeignNotHystrixClient{
    @Override
    public User getUserNotHystrix(Long id) {
        System.out.println(Thread.currentThread().getId());
        User user = new User();
        user.setId(1L);
        return user;
    }
}
