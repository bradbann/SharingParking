package com.project.run;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.parking.common.util.IpAddressUtil;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.parking.common.feignInterfaces")
@ComponentScan({"com.project.controller","com.project.service","com.project.filter"})
@MapperScan("com.project.dao")
public class BackstageVerifyRun {

    public static void main(String[] args) {
        SpringApplication.run(BackstageVerifyRun.class, args);
    }
    @Bean
    public IpAddressUtil ipAddressUtil() {
    	return new IpAddressUtil();
    }

}
