package com.devsuperior.payrool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@RibbonClient(name = "hr-worker")
public class HrPayroolApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayroolApplication.class, args);
	}

}
