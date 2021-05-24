/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.api;

import java.math.BigDecimal;

/**
 *
 * @author amrit
 */
public class Amount {
    
    private BigDecimal amount;
    private String localeDefinition;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLocaleDefinition() {
        return localeDefinition;
    }

    public void setLocaleDefinition(String localeDefinition) {
        this.localeDefinition = localeDefinition;
    }

    @Override
    public String toString() {
        return amount  +" - "+ localeDefinition;
    }
    
    
    
}
