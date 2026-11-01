package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicConstructorInject.xml");

           car mycar = (car) applicationContext.getBean("mycar");

           mycar.print();


    }
}
