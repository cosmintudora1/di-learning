package cosmin.learnspring.didemo.controllers;

import cosmin.learnspring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectorController {


    //@Autowired poate fi pus pe declaratia obiectului sau pe metoda/constructor
    @Autowired
    @Qualifier("setterGreetingService")
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService (GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
