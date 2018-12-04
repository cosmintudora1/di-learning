package cosmin.learnspring.didemo.controllers;

import cosmin.learnspring.didemo.controllers.PropertyInjectionController;
import cosmin.learnspring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectionControllerTest {

    private PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp () throws Exception {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_COSMIN, propertyInjectionController.sayHello());
    }


}
