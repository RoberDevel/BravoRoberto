package com.roberdev.clase5ejercicio1.service;

import com.roberdev.clase5ejercicio1.dto.CalAlumDTO;
import com.roberdev.clase5ejercicio1.entity.Alumno;
import com.roberdev.clase5ejercicio1.entity.Calificacion;

import java.util.List;


public interface ICalificacionService {

    List<Alumno> obtenerEstudiantes();


    Calificacion obtenerCalificacionesPorNumMatricula(Long numMatricula);

    List<CalAlumDTO> obtenerCalificacionesOrdenDesc();
}
