/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.propertyeditor;

import it.amrito.love.calculator.api.CreditCard;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author amrit
 */
@FunctionalInterface
public interface CcConverter extends Converter<CreditCard,String>{
    
}
