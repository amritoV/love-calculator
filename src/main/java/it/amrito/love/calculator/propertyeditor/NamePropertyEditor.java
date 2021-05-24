/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 *
 * @author amrit
 */
public class NamePropertyEditor extends PropertyEditorSupport {
    
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        
        String convertedString = text.toUpperCase();
        
        setValue(convertedString);
        
    }
    
}
