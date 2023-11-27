package com.re;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RelationalExecutiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationalExecutiveApplication.class, args);
	}

}
