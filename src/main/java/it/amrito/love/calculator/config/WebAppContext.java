/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.config;

import it.amrito.love.calculator.formatter.PhoneFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 *
 * @author amrit
 */


@EnableWebMvc
@Configuration
@ComponentScan(basePackages ="it.amrito.love.calculator")
public class WebAppContext implements WebMvcConfigurer {
    
    
    @Bean
    public InternalResourceViewResolver getviewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry){
        System.out.println("Registering PhoneFormatter in FormatterRegistry");
        registry.addFormatter(new PhoneFormatter());

    }
    
}
