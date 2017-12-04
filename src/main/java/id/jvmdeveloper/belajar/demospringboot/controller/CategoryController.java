package id.jvmdeveloper.belajar.demospringboot.controller;

import id.jvmdeveloper.belajar.demospringboot.entity.Category;
import id.jvmdeveloper.belajar.demospringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category getById(@PathVariable("id") Long id){
        System.out.println("Masuk");
        return categoryRepository.findOne(id);
    }
}
