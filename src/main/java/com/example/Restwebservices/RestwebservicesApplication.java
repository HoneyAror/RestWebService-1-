
package com.example.Restwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
@ComponentScan
public class RestwebservicesApplication {

	public static void  main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RestwebservicesApplication.class, args);
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}

		//return null;
	}

	@Bean
	public LocaleResolver localResolver() {
		SessionLocaleResolver localeResolver=new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	@Bean
	public ResourceBundleMessageSource messageSource() {
		 ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		 messageSource.setBasename("messages");
		return messageSource;
	}
}
