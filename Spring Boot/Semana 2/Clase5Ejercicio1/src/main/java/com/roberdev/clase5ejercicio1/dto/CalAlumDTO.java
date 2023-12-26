package com.roberdev.clase5ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalAlumDTO {

    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private String nombre;

}
