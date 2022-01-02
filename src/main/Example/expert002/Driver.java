package expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/Example/expert002.xml");

        Car car = context.getBean("car", Car.class);
        Tire tire = context.getBean("tire", Tire.class);

        car.setTire(tire);

        System.out.println(car.getTireBrand());

    }
}
