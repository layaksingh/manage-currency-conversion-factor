package com.currency.conversion.factor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.test.context.junit.jupiter.EnabledIf;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageCurrencyConversionFactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageCurrencyConversionFactorApplication.class, args);
	}

}

