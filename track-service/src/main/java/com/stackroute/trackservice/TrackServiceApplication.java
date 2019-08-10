package com.stackroute.trackservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;




@SpringBootApplication
@EnableEurekaClient
public class TrackServiceApplication
{
	private static Logger logger = (Logger) LoggerFactory.getLogger(TrackServiceApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(TrackServiceApplication.class, args);

		logger.debug("This is Debug Message");
		logger.info("This is an Info Message");
		logger.warn("This is a Warn Message");
		logger.error("This is an error Message");
	}
}
