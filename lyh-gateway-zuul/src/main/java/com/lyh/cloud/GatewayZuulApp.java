package com.lyh.cloud;

import com.lyh.cloud.filter.PreZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayZuulApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(GatewayZuulApp.class,args);
    }
    @Bean
    public PreZuulFilter preZuulFilter(){
        return new PreZuulFilter();
    }
}
