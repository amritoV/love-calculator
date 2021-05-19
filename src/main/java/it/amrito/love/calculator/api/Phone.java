package it.amrito.love.calculator.api;

public class Phone {


    private String countryCode;
    private String userNumber;

    public Phone(){

    }
    public Phone(String countryCode, String userNumber){
        this.countryCode = countryCode;
        this.userNumber = userNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String toString(){
        return countryCode + "-" +userNumber;
    }
}
