package com.sts.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class AccountMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(AccountMs1Application.class, args);
	}

}
