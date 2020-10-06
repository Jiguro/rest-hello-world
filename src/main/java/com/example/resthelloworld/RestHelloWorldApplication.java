package com.example.resthelloworld;

import com.example.resthelloworld.config.properties.DataSFProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties({DataSFProperties.class})
public class RestHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestHelloWorldApplication.class, args);
	}

}
