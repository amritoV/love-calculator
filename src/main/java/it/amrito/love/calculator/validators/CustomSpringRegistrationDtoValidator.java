/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.validators;

import it.amrito.love.calculator.api.RegistrationDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author amrit
 */
@Component
public class CustomSpringRegistrationDtoValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return RegistrationDto.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "username.empty", "username can't be empty");
        
        RegistrationDto dto = (RegistrationDto)o;
        if(!(dto.getUserName().contains("_"))){
            //errors.rejectValue("userName", "");
            errors.rejectValue("userName", "username.invalid", "username must contain ' _ ' ");
        }
        
        /*
        String email=dto.getCommunicationDto().getEmail().toLowerCase();
        if(!email.endsWith("@seleniumexpress.com")){
            errors.rejectValue("communicationDto.email", "email.invalid", "email domain should be: @seleniumexpress.com"); 
        }
        */
        
    }
    
}
