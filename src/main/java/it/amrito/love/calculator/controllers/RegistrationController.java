package it.amrito.love.calculator.controllers;


import it.amrito.love.calculator.api.CommunicationDto;
import it.amrito.love.calculator.api.Phone;
import it.amrito.love.calculator.api.RegistrationDto;
import it.amrito.love.calculator.propertyeditor.NamePropertyEditor;
import it.amrito.love.calculator.validators.CustomSpringRegistrationDtoValidator;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
    
    @Autowired
    CustomSpringRegistrationDtoValidator registrationDtoValidator;

    @RequestMapping("/register")
    public String processRegistration(@ModelAttribute("registrationUserDto") RegistrationDto user){
        System.out.println("inside RegistrationController.processRegistration()");
        Phone phone = new Phone("39","12345678");
        CommunicationDto communicationDto =new CommunicationDto();
        communicationDto.setPhone(phone);
        user.setCommunicationDto(communicationDto);

        System.out.println("=========="+user.getUserName());
        return "registration";
    }

    @RequestMapping(value= "/save-registration", method = RequestMethod.POST)
    public String saveRegistration(@Valid @ModelAttribute("registrationUserDto") RegistrationDto user, BindingResult result){
        System.out.println("inside RegistrationController.saveRegistration");
        registrationDtoValidator.validate(user, result);
        if(result.hasErrors()){
            List<ObjectError> errors=result.getAllErrors();
            errors.forEach(System.out::println);
            return "registration";
        }

        return "registration-result";
    }
    
    
    @InitBinder
    public void initBinder(WebDataBinder binder){
        System.out.println("----------------------------------------");
        System.out.println("Inside RegistrationController.initBinder()");
        
        StringTrimmerEditor trimmer=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,"name", trimmer);
        
        NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
        
        binder.registerCustomEditor(String.class,"name", namePropertyEditor);
        
       // binder.addValidators(new CustomSpringRegistrationDtoValidator());
        
    }

}
