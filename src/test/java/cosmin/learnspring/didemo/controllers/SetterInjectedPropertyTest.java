package cosmin.learnspring.didemo.controllers;

import cosmin.learnspring.didemo.controllers.SetterInjectorController;
import cosmin.learnspring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedPropertyTest {


    private SetterInjectorController setterInjectorController;


    @Before
    public void setUp () throws Exception {
        this.setterInjectorController = new SetterInjectorController();
        this.setterInjectorController.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    public void testGreetings () throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_COSMIN, setterInjectorController.sayHello());
    }
}
