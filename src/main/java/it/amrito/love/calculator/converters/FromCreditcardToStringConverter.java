/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.converters;

import it.amrito.love.calculator.api.CreditCard;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author amrit
 */
public class FromCreditcardToStringConverter implements Converter<CreditCard,String>{

    @Override
    public String convert(CreditCard s) {
        return s.getFirstFourDigits()+"-"+
                s.getSecondFourDigits()+"-"+
                s.getThirdFourDigits()+"-"+
                s.getFourthFourDigits();
    }
    
}
