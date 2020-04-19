package com.yh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSpringApplication.class,args);
    }
}
