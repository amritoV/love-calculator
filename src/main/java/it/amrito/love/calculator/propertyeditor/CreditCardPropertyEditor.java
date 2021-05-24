/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.propertyeditor;

import it.amrito.love.calculator.api.CreditCard;
import java.beans.PropertyEditorSupport;
import java.text.ParseException;

/**
 *
 * @author amrit
 */
public class CreditCardPropertyEditor extends PropertyEditorSupport{
    
    
    @Override
    public String getAsText(){
        System.out.println("inside CreditCardPropertyEditor.getAsText()");
        CreditCard creditCard = (CreditCard)getValue();
        return creditCard.getFirstFourDigits()+"-"+
               creditCard.getSecondFourDigits()+"-"+
               creditCard.getThirdFourDigits()+"-"+
               creditCard.getFourthFourDigits();
    }
    
    @Override
    public void  setAsText(String text) throws IllegalArgumentException{
        System.out.println("inside CreditCardPropertyEditor.setAsText()");
        String[] digitSplit = text.split("-");
        CreditCard creditCard=new CreditCard();
        if(digitSplit.length != 4) throw new IllegalArgumentException("Invalid Credit Card");
        for(int k=0; k<digitSplit.length; k++){
            if(digitSplit[k].length() != 4) throw new IllegalArgumentException("Invalid Credit Card");
        }

        creditCard.setFirstFourDigits(Integer.parseInt(digitSplit[0]));
        creditCard.setSecondFourDigits(Integer.parseInt(digitSplit[1]));
        creditCard.setThirdFourDigits(Integer.parseInt(digitSplit[2]));
        creditCard.setFourthFourDigits(Integer.parseInt(digitSplit[3]));
        setValue(creditCard);
        
    }   
}
