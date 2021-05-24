/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.config;

import it.amrito.love.calculator.formatter.AmountFormatter;
import it.amrito.love.calculator.formatter.CreditCardFormatter;
import it.amrito.love.calculator.formatter.PhoneFormatter;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;

import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
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
    
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messSource=new ResourceBundleMessageSource();
        messSource.setBasename("messages");
        return messSource;
    }
    
    @Bean
    public LocalValidatorFactoryBean validator(){
        
        LocalValidatorFactoryBean lvfb=new LocalValidatorFactoryBean();
        lvfb.setValidationMessageSource(messageSource());
        return lvfb;
    }
    
    @Override
    public Validator getValidator(){
        return validator();
    }
    

    @Override
    public void addFormatters(FormatterRegistry registry){
        System.out.println("Registering PhoneFormatter in FormatterRegistry");
        registry.addFormatter(new PhoneFormatter());
        //registry.addFormatter(new CreditCardFormatter()); 
        registry.addFormatter(new AmountFormatter()); 

    }
    
}
