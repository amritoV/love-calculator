/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.converters;

import it.amrito.love.calculator.api.CreditCard;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.core.convert.converter.Converter;





/**
 *
 * @author amrit
 */
public class FromStringToCreditcardConverter implements Converter<String,CreditCard>{

    @Override
    public CreditCard convert(String s) {
        CreditCard creditCard=new CreditCard();
        try {
            System.out.println("calling CreditCardFormatter.parse()");
            String[] digitSplit = s.split("-");
            if(digitSplit.length != 4) throw new ParseException("Invalid Credit Card",1);
            for(int k=0; k<digitSplit.length; k++){
                if(digitSplit[k].length() != 4) throw new ParseException("Invalid Credit Card",1);
            }
            
            creditCard.setFirstFourDigits(Integer.parseInt(digitSplit[0]));
            creditCard.setSecondFourDigits(Integer.parseInt(digitSplit[1]));
            creditCard.setThirdFourDigits(Integer.parseInt(digitSplit[2]));
            creditCard.setFourthFourDigits(Integer.parseInt(digitSplit[3]));
        } catch (ParseException ex) {
            Logger.getLogger(FromStringToCreditcardConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return creditCard;
    }
    
}
