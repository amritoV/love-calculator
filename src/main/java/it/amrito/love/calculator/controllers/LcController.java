/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.controllers;

import it.amrito.love.calculator.api.UserInfoDto;
import java.util.Locale;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author amrit
 */

@Controller
public class LcController {
    
    
    @Autowired
    ResourceBundleMessageSource rbms;
    
    @ResponseBody
    @RequestMapping("/test")
    public String testHello(){
        
        return "hey it's working";
    }
    
    
    @RequestMapping({"","/","/index","/home"})
    public String getHome(@ModelAttribute("userInfo") UserInfoDto userInfo1){
        String mess=rbms.getMessage("age.error", null,Locale.ENGLISH);
        System.out.println(mess);

        return "home";
    }
    
    
    @RequestMapping({"/process-homepage"})
    public String processHome(@Valid @ModelAttribute("userInfo") UserInfoDto userInfo2, BindingResult result){
        if(result.hasErrors()){
            return "home";
        }
        
        return "result";
    }

}
