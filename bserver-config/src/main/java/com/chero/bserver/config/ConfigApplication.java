package com.chero.bserver.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigApplication {

	// 阿三发射点反对发射点
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
		int a = getA();
	}

	public static int getA() {
		return 1;
	}
	//546545646486456475
}
