package it.amrito.love.calculator.api;

import javax.validation.constraints.Size;

public class CreditCard {

    @Size(min=4, max=4)
    private Integer firstFourDigits;
    private Integer secondFourDigits;
    private Integer thirdFourDigits;
    private Integer fourthFourDigits;
}
