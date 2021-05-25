/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.validators;

import it.amrito.love.calculator.api.CommunicationDto;
import it.amrito.love.calculator.api.RegistrationDto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author amrit
 */
public class CustomSpringCommunicationDtoValidator implements Validator{
    
    
    @Override
    public boolean supports(Class<?> type) {
        return RegistrationDto.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        RegistrationDto RegDto=(RegistrationDto)o;
        CommunicationDto dto = RegDto.getCommunicationDto();
        String email=dto.getEmail().toLowerCase();
        if(!email.endsWith("@seleniumexpress.com")){
            errors.rejectValue("communicationDto.email", "communicationdto.email.invalid", "email domain should be: @seleniumexpress.com"); 
        }
    }
    
}
