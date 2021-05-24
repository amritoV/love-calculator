/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.formatter;

import it.amrito.love.calculator.api.Amount;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author amrit
 */
public class AmountFormatter implements Formatter<Amount> {

    @Override
    public String print(Amount t, Locale locale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Amount parse(String string, Locale locale) throws ParseException {
        String[] arr = string.split(" ");
        Amount amount=new Amount();
        amount.setAmount(new BigDecimal(arr[0]));
        amount.setLocaleDefinition(arr[1]);
        return amount;
    }
    
}
