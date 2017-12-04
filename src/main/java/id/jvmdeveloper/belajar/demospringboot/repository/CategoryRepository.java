package id.jvmdeveloper.belajar.demospringboot.repository;

import id.jvmdeveloper.belajar.demospringboot.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
