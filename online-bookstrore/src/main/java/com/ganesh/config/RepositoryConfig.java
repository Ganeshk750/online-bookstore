package com.ganesh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.ganesh.model.Book;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
   
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	  config.exposeIdsFor(Book.class);
	}
}