/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.controllers;

import it.amrito.love.calculator.api.UserInfoDto;
import javax.validation.Valid;

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
    
    
    
    
    @ResponseBody
    @RequestMapping("/test")
    public String testHello(){
        
        return "hey it's working";
    }
    
    
    @RequestMapping({"","/","/index","/home"})
    public String getHome(@ModelAttribute("userInfo") UserInfoDto userInfo1){
        
        
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
