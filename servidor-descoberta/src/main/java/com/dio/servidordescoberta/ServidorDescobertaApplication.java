package com.dio.servidordescoberta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServidorDescobertaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorDescobertaApplication.class, args);
	}

}
