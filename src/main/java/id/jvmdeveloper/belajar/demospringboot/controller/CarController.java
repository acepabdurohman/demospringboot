package id.jvmdeveloper.belajar.demospringboot.controller;

import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import id.jvmdeveloper.belajar.demospringboot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/save")
    public Car save(@RequestBody Car car){
        return carRepository.save(car);
    }

    @GetMapping("")
    public List<Car> getAll(){
        List<Car> cars = (List<Car>) carRepository.findAll();
        return cars;
    }

    @GetMapping("/{id}")
    public Car getAll(@PathVariable("id") Long id){
        return carRepository.findOne(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        System.out.println("Masuk ke delete");
        carRepository.delete(id);
        return id + " berhasil di hapus";
    }

    @GetMapping("/brand")
    public List<Car> getByBrand(@RequestParam(value = "nama") String nama){
        List<Car> cars = carRepository.findAllByBrand(nama);
        cars.forEach(System.out::println);
        return cars;
    }
}
