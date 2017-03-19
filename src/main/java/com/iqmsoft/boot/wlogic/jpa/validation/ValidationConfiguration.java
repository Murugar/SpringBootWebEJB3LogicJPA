package com.iqmsoft.boot.wlogic.jpa.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;


@Configuration
public class ValidationConfiguration {
	@Bean
	LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		return validator;
	}
	
	@Bean
	MethodValidationPostProcessor methodValidationPostProcessor() {
		MethodValidationPostProcessor postProcessor = new MethodValidationPostProcessor();
		return postProcessor;
	}
}
