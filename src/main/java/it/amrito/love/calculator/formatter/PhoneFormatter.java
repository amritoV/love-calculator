package it.amrito.love.calculator.formatter;

import it.amrito.love.calculator.api.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;


public class PhoneFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String stringPhone, Locale locale) throws ParseException {
        System.out.println("calling PhoneFormatter.parse()");
        Phone phone = new Phone();
        String[] arrayPhone = stringPhone.split("-");

        int index = stringPhone.indexOf('-');
        if(index == -1){
            phone.setCountryCode("39");
            phone.setUserNumber(arrayPhone[0]);
        }
        else{
            phone.setCountryCode( arrayPhone[0].isBlank() ? "39" : arrayPhone[0]);
            phone.setUserNumber(arrayPhone[1]);
        }
        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        System.out.println("calling PhoneFormatter.print()");
        return phone.getCountryCode()+"-"+phone.getUserNumber();
    }
}
