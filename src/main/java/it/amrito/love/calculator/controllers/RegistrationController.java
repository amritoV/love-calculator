package it.amrito.love.calculator.controllers;


import it.amrito.love.calculator.api.CommunicationDto;
import it.amrito.love.calculator.api.Phone;
import it.amrito.love.calculator.api.RegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String processRegistration(@ModelAttribute("registrationUserDto") RegistrationDto user){
        Phone phone = new Phone("39","380prova92");
        CommunicationDto communicationDto =new CommunicationDto();
        communicationDto.setPhone(phone);
        user.setCommunicationDto(communicationDto);


        return "registration";
    }

    @RequestMapping("/save-registration")
    public String saveRegistration(@ModelAttribute("registrationUserDto") RegistrationDto user){

        System.out.println(user.getCommunicationDto());

        return "registration-result";
    }


}
