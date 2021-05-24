package it.amrito.love.calculator.api;

import javax.validation.constraints.Size;

public class CreditCard {

    //@Size(min=4, max=4)
    private Integer firstFourDigits;
    private Integer secondFourDigits;
    private Integer thirdFourDigits;
    private Integer fourthFourDigits;

    public Integer getFirstFourDigits() {
        return firstFourDigits;
    }

    public void setFirstFourDigits(Integer firstFourDigits) {
        this.firstFourDigits = firstFourDigits;
    }

    public Integer getSecondFourDigits() {
        return secondFourDigits;
    }

    public void setSecondFourDigits(Integer secondFourDigits) {
        this.secondFourDigits = secondFourDigits;
    }

    public Integer getThirdFourDigits() {
        return thirdFourDigits;
    }

    public void setThirdFourDigits(Integer thirdFourDigits) {
        this.thirdFourDigits = thirdFourDigits;
    }

    public Integer getFourthFourDigits() {
        return fourthFourDigits;
    }

    public void setFourthFourDigits(Integer fourthFourDigits) {
        this.fourthFourDigits = fourthFourDigits;
    }
    
    @Override
    public String toString(){
        return firstFourDigits+"-"+secondFourDigits+"-"+thirdFourDigits+"-"+fourthFourDigits+"-";
    }
}
