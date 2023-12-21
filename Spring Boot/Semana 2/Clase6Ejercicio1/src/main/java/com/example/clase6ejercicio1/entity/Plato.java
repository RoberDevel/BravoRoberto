package com.example.clase6ejercicio1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Plato {

    private Long id;
    private String nombre;
    private Double precio;
    private List<Ingrediente> ingredientes;


}
