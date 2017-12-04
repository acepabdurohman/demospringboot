package id.jvmdeveloper.belajar.demospringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private String brand;

    private String model;

    private String color;

    private String fuel;

    private Integer year;

    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnore
    private Category category;

}
