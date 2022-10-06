package com.hzh.gcll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GcllApplication {
	private static final Logger logger = LoggerFactory.getLogger(GcllApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GcllApplication.class, args);
		logger.info("Logging INFO with Logback");
		logger.error("Logging ERROR with Logback");
	}

}
