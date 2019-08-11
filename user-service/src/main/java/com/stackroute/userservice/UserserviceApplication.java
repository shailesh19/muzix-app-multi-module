package com.stackroute.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserserviceApplication
{
	private static Logger logger = LoggerFactory.getLogger(UserserviceApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(UserserviceApplication.class, args);

		logger.debug("This is Debug Message");
		logger.info("This is an Info Message");
		logger.warn("This is a Warn Message");
		logger.error("This is an Error Message");
	}

}
