/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author amrit
 */
public class AgeValidatorConstraint implements ConstraintValidator<AgeValidator,Integer> {
    
    private int lower, upper;

    @Override
    public void initialize(AgeValidator constraintAnnotation) {
        this.lower=constraintAnnotation.lower();
        this.upper=constraintAnnotation.upper();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        System.out.println("Inside AgeValidator.isValid()");
        
        if(value == null) return false;
        
        if(value<lower || value >upper) return false;
        
        return true;
    }
    
}
