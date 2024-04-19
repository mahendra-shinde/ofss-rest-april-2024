package com.mahendra;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;

@ApplicationPath("/api/v1")
public class AppConfig extends Application{
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(LoanResource.class);
		return classes;
	}
	
}
