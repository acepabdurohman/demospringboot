package id.jvmdeveloper.belajar.demospringboot;

import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import id.jvmdeveloper.belajar.demospringboot.entity.Category;
import id.jvmdeveloper.belajar.demospringboot.repository.CategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void testFindOne(){
        Long id = 1l;
        Category category = categoryRepository.findOne(id);
        //Assert.assertEquals("mewah", category.getNama());
        List<Car> carList = category.getCars();
        carList.forEach(System.out::println);
    }
}
