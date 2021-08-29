package com.dio.servidorDeConfiguracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServidorDeConfiguracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorDeConfiguracaoApplication.class, args);
	}

}
