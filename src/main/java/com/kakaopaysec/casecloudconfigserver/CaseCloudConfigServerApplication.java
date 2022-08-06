package com.kakaopaysec.casecloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CaseCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseCloudConfigServerApplication.class, args);
	}

}
