package com.msteam;

import static java.lang.Boolean.FALSE;

import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleCassandraProjectApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleCassandraProjectApplication.class);

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SampleCassandraProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Iterable<User> users = repository.findAll();

		StreamSupport.stream(users.spliterator(), FALSE)
		.forEach(user -> LOGGER.info("{}", user));
	}
	
}
