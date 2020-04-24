package com.joeltaydy.tshirtservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
// n @EnableRetry
public class TshirtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TshirtApplication.class, args);
	}

}
