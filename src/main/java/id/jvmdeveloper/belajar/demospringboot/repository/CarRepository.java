package id.jvmdeveloper.belajar.demospringboot.repository;

import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long>{

    List<Car> findAllByBrand(String brand);
}
