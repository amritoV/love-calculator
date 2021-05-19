package it.amrito.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

    @GetMapping("/pay")
    public String getPayment(){

        return "payment";
    }
}
