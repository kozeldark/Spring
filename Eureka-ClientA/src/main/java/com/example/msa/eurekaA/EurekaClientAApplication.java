package com.example.msa.eurekaA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAApplication.class, args);
	}

}
