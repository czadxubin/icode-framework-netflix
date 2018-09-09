package com.xbz.study.eureka.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyEnurekaClient01Application {
	public static void main(String[] args) {
        SpringApplication.run(MyEnurekaClient01Application.class, args);
	}
}
