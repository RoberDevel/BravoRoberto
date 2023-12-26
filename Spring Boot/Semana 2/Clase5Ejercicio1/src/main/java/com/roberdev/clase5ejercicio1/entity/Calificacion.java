package com.roberdev.clase5ejercicio1.entity;

//En la clase calificación se debe guardar: id, calificacion1, calificacion2, calificacion3, promedio, Alumno un Alumno.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {

    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private Alumno alumno;

}
