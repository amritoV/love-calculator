package it.amrito.love.calculator.api;

import it.amrito.love.calculator.validators.PhoneValidator;
import javax.validation.Valid;


public class CommunicationDto {


    private String email;
    
    @PhoneValidator
    private Phone phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CommunicationDto{" +
                "email='" + email + '\'' +
                ", cellPhone='" + phone + '\'' +
                '}';
    }
}
