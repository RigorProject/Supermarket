package com.rigor.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	private static final Logger logger = LoggerFactory.getLogger(AppInitializer.class);
	public void onStartup(ServletContext container) throws ServletException {
		
		/**
		 * Testing logs inside App Intializer
		 * 
		 */
	
		String name = "Testing Logs inside product App Intitializer";
		
		  logger.info("Hello from Web App Initializer.");
		  logger.debug("In bar my name is {}.", name);
		  
		  
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfig.class);
		ctx.setServletContext(container);

		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
