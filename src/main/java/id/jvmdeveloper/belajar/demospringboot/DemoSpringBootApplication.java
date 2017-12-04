package id.jvmdeveloper.belajar.demospringboot;

import id.jvmdeveloper.belajar.demospringboot.controller.CarController;
import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import id.jvmdeveloper.belajar.demospringboot.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demo(CarController carController){
		return (args) -> {
			System.out.println("Masuk kesini");
			Car car = new Car();
			car.setBrand("Toyota");
			car.setFuel("Pertamax");
			car.setColor("Hitam");
			car.setModel("Sport");
			car.setYear(2017);
			carController.save(car);
			System.out.println("Berhasil save");
		};
	}*/
}
