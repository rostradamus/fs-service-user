package com.fitsight.fsserviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FsServiceUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(FsServiceUserApplication.class, args);
	}
}
