package com.example.msa.eurekaB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "hello world!";
	}
	@RequestMapping("/foo")
	public String foo(String foo) {
		return "hello "+foo+"!";
	}
}