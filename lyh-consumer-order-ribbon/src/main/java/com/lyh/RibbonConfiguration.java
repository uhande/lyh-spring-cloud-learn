package com.lyh;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class RibbonConfiguration {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
