package it.amrito.love.calculator.controllers;

import it.amrito.love.calculator.api.BillDto;
import it.amrito.love.calculator.api.CreditCard;
import it.amrito.love.calculator.propertyeditor.CreditCardPropertyEditor;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping({"/",""})
    public String getPayment(/*@ModelAttribute("paymentInfo")BillDto billDto*/ Model model){
        
        BillDto billDto =new BillDto();
        
        CreditCard creditCard=new CreditCard();
        creditCard.setFirstFourDigits(1234);
        creditCard.setSecondFourDigits(1234);
        creditCard.setThirdFourDigits(1234);
        creditCard.setFourthFourDigits(1234);
        
        billDto.setCreditCard(creditCard);
        
        model.addAttribute("paymentInfo", billDto);

        return "payment";
    }
    
    
    @PostMapping("/process")
    public String processPayment(@Valid @ModelAttribute("paymentInfo")BillDto billDto, BindingResult result){
        
        if(result.hasErrors()) return "payment";
        
        return "payment-processed";
    }
    
    
    @InitBinder
    public void InitBinder(WebDataBinder binder){
        
        CreditCardPropertyEditor credidCardPE=new CreditCardPropertyEditor();
        
        //binder.registerCustomEditor(CreditCard.class,"creditCard",credidCardPE);
        
    }
}
