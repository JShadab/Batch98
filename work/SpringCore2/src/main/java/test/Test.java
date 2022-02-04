package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.config.SpringConfig;
import com.shad.model.Car;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car car = (Car) context.getBean("car");
		car.drive();

//		Engine engine = context.getBean(Engine.class);
//		engine.start();
	}
}
