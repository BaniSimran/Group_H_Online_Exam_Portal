package com.examportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories("com.examportal.dao")
public class OnlineExamPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineExamPortalApplication.class, args);
	}

}
