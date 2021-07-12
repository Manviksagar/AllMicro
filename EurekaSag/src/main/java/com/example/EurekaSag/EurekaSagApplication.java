package com.example.EurekaSag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSagApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSagApplication.class, args);
	}

}
