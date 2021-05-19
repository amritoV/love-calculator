/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 *
 * @author amrit
 */
public class UserInfoDto {
    
    
    @NotEmpty(message ="* userName can not be empty")
    @Size(min = 3, max = 15, message="* username should have char between 3-15")
    private String userName;
    
    @NotEmpty(message ="* crushName can not be empty")
    @Size(min = 3, max = 15, message="* crushName should have char between 3-15")
    private String crushName;
    
    @AssertTrue(message ="please accept terms&conditions")
    private boolean termsAndCondition;

    public boolean getTermsAndCondition() {
        return termsAndCondition;
    }

    public void setTermsAndCondition(boolean termsAndCondition) {
        this.termsAndCondition = termsAndCondition;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" + "userName=" + userName + ", crushName=" + crushName + '}';
    }
    
    
    
    
}
