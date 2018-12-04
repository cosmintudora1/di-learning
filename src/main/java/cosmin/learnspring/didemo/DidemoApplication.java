package cosmin.learnspring.didemo;

import cosmin.learnspring.didemo.controllers.ConstructorInjectedController;
import cosmin.learnspring.didemo.controllers.MyController;
import cosmin.learnspring.didemo.controllers.PropertyInjectionController;
import cosmin.learnspring.didemo.controllers.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DidemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DidemoApplication.class, args);

        System.out.println(ctx.getBean(MyController.class).sayHello());

        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());

        System.out.println(ctx.getBean(SetterInjectorController.class).sayHello());

        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
