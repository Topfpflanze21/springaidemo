package com.example.springaidemo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringaidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaidemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ChatClient .Builder builder) {
		return args -> {
		    var client = builder.build();
			var response = client.prompt("Tell me a joke").call().content();

			System.out.println(response);
		};
	}

}
