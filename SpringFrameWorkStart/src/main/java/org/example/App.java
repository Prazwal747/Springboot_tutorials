package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("springconfig.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(x-> System.out.println(x));
        Engine engine = (Engine) context.getBean("petrolEngine");
        Car car = new Car();
        car.checkEngineType(engine);

    }
}
