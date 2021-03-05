package com.cts;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class InternationalizationApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(InternationalizationApplication.class, args);
	}
	@Bean
	public LocaleResolver localResolver() {
		SessionLocaleResolver resolver =new SessionLocaleResolver();
		resolver.setDefaultLocale(Locale.US);
		return resolver;
		
	}
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor inter=new LocaleChangeInterceptor();
		inter.setParamName("lang");
		return inter;
	}

	
	@Override
	public void addInterceptors(InterceptorRegistry register) {
		register.addInterceptor(localeChangeInterceptor());
	}
}
