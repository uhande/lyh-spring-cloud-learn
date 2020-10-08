package com.lyh.cloud;

import com.lyh.cloud.pojo.User;
import com.lyh.config.ConfigurationNotHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provider-user1",configuration = ConfigurationNotHystrix.class,fallback = HystrixClientNotHystrixFallback.class)
public interface UserFeignNotHystrixClient {
    @RequestMapping (value = "/user/{id}", method = RequestMethod.GET)
    User getUserNotHystrix(@PathVariable Long id);
}
