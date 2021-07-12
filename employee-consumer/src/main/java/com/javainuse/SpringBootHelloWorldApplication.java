package com.javainuse;

import java.io.IOException;

import com.javainuse.controllers.ConsumerControllerClientt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;



@SpringBootApplication
@Slf4j
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootHelloWorldApplication.class, args);
		
		/*ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();*/
		ConsumerControllerClientt consumerControllerClient=ctx.getBean(ConsumerControllerClientt.class);
		consumerControllerClient.getEmployee();
	}
	
	@Bean
	public  ConsumerControllerClientt  consumerControllerClientt()
	{
		return  new ConsumerControllerClientt();
	}
}
