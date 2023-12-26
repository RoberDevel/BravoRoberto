package com.roberdev.clase5ejercicio1.entity;

//De cada estudiante se solicitan los siguientes datos: num_matricula, nombre, apellido, fecha de nacimiento.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Alumno {

    private Long numMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;


}
