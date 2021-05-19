/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.amrito.love.calculator.api;

import java.util.List;

/**
 *
 * @author amrit
 */
public class RegistrationDto {
    
    
    private String name;
    
    private String userName;
    
    private char[] password;
    
    private String country;
    
    private List<String> hobby;
    
    private String gender;

    private Integer age;

    private CommunicationDto communicationDto;

//***Getters and Setters**

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CommunicationDto getCommunicationDto() {
        return communicationDto;
    }

    public void setCommunicationDto(CommunicationDto communicationDto) {
        this.communicationDto = communicationDto;
    }
    

    @Override
    public String toString() {
        return "RegistrationDto{" + "name=" + name + ", userName=" + userName + ", password=" + password + ", country=" + country + '}';
    }
    
    
    
    
    
}
