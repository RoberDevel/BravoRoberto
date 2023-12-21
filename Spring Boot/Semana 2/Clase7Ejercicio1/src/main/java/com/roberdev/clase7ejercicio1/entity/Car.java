package com.roberdev.clase7ejercicio1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private Long id;
    private String brand;
    private String model;
    private String kilometers;
    private Integer doors;
    private Double price;


}
