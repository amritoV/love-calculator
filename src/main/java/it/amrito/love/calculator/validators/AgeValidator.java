/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


/**
 *
 * @author amrit
 */
@Documented
@Target(ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidatorConstraint.class)
public @interface AgeValidator {
    

    
    public int lower() default 18;
    
    public int upper() default 30;
    
    public String message() default "{age.error}";
    
    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
