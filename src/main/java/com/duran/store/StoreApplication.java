package com.duran.store;

import com.duran.store.infrastructure.adapters.ouput.persistence.entity.CustomerEntity;
import com.duran.store.infrastructure.adapters.ouput.persistence.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StoreApplication {

	private final CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}


	@Bean
	CommandLineRunner init() {
		return args -> {

			List<CustomerEntity> customers = Arrays.asList(
					CustomerEntity.builder()
							.firstname("John")
							.lastname("Doe")
							.email("doe@gmail.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Jane")
							.lastname("Smith")
							.email("jane.smith2@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Alice")
							.lastname("Johnson")
							.email("alice.johnson3@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Bob")
							.lastname("Williams")
							.email("bob.williams4@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Charlie")
							.lastname("Brown")
							.email("charlie.brown5@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Diana")
							.lastname("Miller")
							.email("diana.miller6@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Edward")
							.lastname("Davis")
							.email("edward.davis7@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("Fiona")
							.lastname("Garcia")
							.email("fiona.garcia8@example.com")
							.build(),
					CustomerEntity.builder()
							.firstname("George")
							.lastname("Martinez")
							.email("george.martinez9@example.com")
							.build()
			);
			customerRepository.saveAll(customers);
		};
	}
}
