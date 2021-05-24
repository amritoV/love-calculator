/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.validators;

import it.amrito.love.calculator.api.CommunicationDto;
import it.amrito.love.calculator.api.Phone;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author amrit
 */
public class PhoneValidatorConstraint implements ConstraintValidator<PhoneValidator,Phone>{

    @Override
    public void initialize(PhoneValidator constraintAnnotation) {
        
    }

    @Override
    public boolean isValid(Phone value, ConstraintValidatorContext context) {
        System.out.println("Inside PhoneValidator.isValid()");
        if(value == null) return false;
        String completeNumber=value.getCountryCode()+value.getUserNumber();
        int phoneSize = completeNumber.length();
        if(phoneSize != 10) return false;
        for(int k=0; k<phoneSize; k++){
            char c=completeNumber.charAt(k);
            if(c>= '0' && c<= '9') continue;
            return false;
        }
        
        
        return true;
    }
    
}
