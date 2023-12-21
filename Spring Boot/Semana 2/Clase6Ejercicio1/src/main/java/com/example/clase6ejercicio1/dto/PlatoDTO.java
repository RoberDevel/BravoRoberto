package com.example.clase6ejercicio1.dto;

import com.example.clase6ejercicio1.entity.Ingrediente;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PlatoDTO implements Serializable {

    private Long id;
    private String nombre;
    private List<Integer> ingredientes;

}
