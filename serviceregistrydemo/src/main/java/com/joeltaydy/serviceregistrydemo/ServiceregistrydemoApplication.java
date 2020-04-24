package com.joeltaydy.serviceregistrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceregistrydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistrydemoApplication.class, args);
	}

}
