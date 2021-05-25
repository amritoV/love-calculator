/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.controllers;

import it.amrito.love.calculator.api.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author amrit
 */
@Controller 
public class EmailController {
    
    
    @RequestMapping("/email-home")
    public String emailHome(Model model){
        EmailDTO emailDto=new EmailDTO();
        model.addAttribute("emailDTO", emailDto);
        return "email-home";
    }
    
    @PostMapping("sending-email")
    public String emailSending(@ModelAttribute("emailDTO") EmailDTO emailDto){
        
        return "email-sent";
    }
    
}
