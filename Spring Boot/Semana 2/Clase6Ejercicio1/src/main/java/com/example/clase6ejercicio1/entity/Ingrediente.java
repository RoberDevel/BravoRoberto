package com.example.clase6ejercicio1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingrediente {

    private Long id;
    private String name;
    private Integer calories;

}
