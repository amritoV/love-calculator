/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author amrit
 */
public class ApplicationInitialiazer{//implements WebApplicationInitializer{

    //@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("Initializing Dispatcher Servlet >>>>>>>>>>>>>>>>>>>>>>>>> AMRITO");
        
        
        AnnotationConfigWebApplicationContext webAppContext=new AnnotationConfigWebApplicationContext();
        webAppContext.register(WebAppContext.class);
        
        
        
        
        DispatcherServlet dispatcherServlet=new DispatcherServlet(webAppContext);
        
        ServletRegistration.Dynamic customDispatcherServlet=servletContext.addServlet("dispatcher", dispatcherServlet);
        
        customDispatcherServlet.setLoadOnStartup(1);
        customDispatcherServlet.addMapping("/");
        
        
    }
    
}
