package id.jvmdeveloper.belajar.demospringboot;

import id.jvmdeveloper.belajar.demospringboot.controller.CarController;
import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarTest {

    @Autowired
    private CarController carController;

    @Test
    public void saveTest(){
        Car car = new Car();
        car.setBrand("Toyota");
        car.setFuel("Pertamax");
        car.setColor("Hitam");
        car.setModel("Sport");
        car.setYear(2017);
        carController.save(car);
    }
}
