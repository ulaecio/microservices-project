package com.ulasoftware.humanresourceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import jdk.jfr.Enabled;

@EnableEurekaServer
@SpringBootApplication
public class HumanResourceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourceEurekaServerApplication.class, args);
	}

}
