package com.springweb.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		System.out.println("WebServletConfiguration.onStartup()");
		AnnotationConfigWebApplicationContext annWebConfig = new AnnotationConfigWebApplicationContext();
		annWebConfig.register(SpringConfig.class);
		annWebConfig.setServletContext(ctx);
		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(annWebConfig));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}
