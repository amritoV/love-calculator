/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.formatter;

import it.amrito.love.calculator.api.CreditCard;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author amrit
 */
public class CreditCardFormatter implements Formatter<CreditCard>{

    @Override
    public String print(CreditCard t, Locale locale) {
        System.out.println("calling CreditCardFormatter.print()");
        return t.getFirstFourDigits() +"-"+
                t.getSecondFourDigits() +"-"+
                t.getThirdFourDigits() +"-"+
                t.getFourthFourDigits();
    }

    @Override
    public CreditCard parse(String string, Locale locale) throws ParseException {
        System.out.println("calling CreditCardFormatter.parse()");
        String[] digitSplit = string.split("-");
        CreditCard creditCard=new CreditCard();
        if(digitSplit.length != 4) throw new ParseException("Invalid Credit Card",1);
        for(int k=0; k<digitSplit.length; k++){
            if(digitSplit[k].length() != 4) throw new ParseException("Invalid Credit Card",1);
        }

        creditCard.setFirstFourDigits(Integer.parseInt(digitSplit[0]));
        creditCard.setSecondFourDigits(Integer.parseInt(digitSplit[1]));
        creditCard.setThirdFourDigits(Integer.parseInt(digitSplit[2]));
        creditCard.setFourthFourDigits(Integer.parseInt(digitSplit[3]));
        return creditCard;
    }
    
}
