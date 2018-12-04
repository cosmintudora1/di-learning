package cosmin.learnspring.didemo.controllers;

import cosmin.learnspring.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectionController {

    @Autowired
    public GreetingServiceImpl greetingService;


    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
