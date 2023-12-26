package com.roberdev.clase5ejercicio1.controller;

import com.roberdev.clase5ejercicio1.dto.CalAlumDTO;
import com.roberdev.clase5ejercicio1.entity.Alumno;
import com.roberdev.clase5ejercicio1.entity.Calificacion;
import com.roberdev.clase5ejercicio1.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/*En la capa controller deberán existir los siguientes endpoints:

	GET /estudiantes: Devuelve una lista de todos los estudiantes sin un orden particular.

	GET /calificaciones/{num_matricula}: Devuelve las calificaciones de un determinado estudiante.

	GET /calificaciones/ordendesc: Devuelve las calificaciones de todos los estudiantes, junto con el nombre de cada uno de ellos ordenados de forma descendente (mayor calificación primero, menor a lo último)*/

@RestController
@RequestMapping("/api")
public class CalificacionController {


    @Autowired
    CalificacionService calificacionService;

    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumnos() {

        return calificacionService.obtenerEstudiantes();
    }

    @GetMapping("/calificaciones/{numMatricula}")
    public Calificacion obtenerCalificacionesPorNumMatricula(@PathVariable Long numMatricula) {

        return calificacionService.obtenerCalificacionesPorNumMatricula(numMatricula);

    }

    @GetMapping("/calificaciones/ordendesc")
    public List<CalAlumDTO> obtenerCalificacionesOrdenDesc() {


        return calificacionService.obtenerCalificacionesOrdenDesc();
    }


}
