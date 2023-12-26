package com.roberdev.clase5ejercicio1.repository;

import com.roberdev.clase5ejercicio1.entity.Alumno;
import com.roberdev.clase5ejercicio1.entity.Calificacion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CalificacionRepository {

    private List<Calificacion> calificaciones;

    public CalificacionRepository() {

        calificaciones = new ArrayList<>();

        calificaciones.add(new Calificacion(8.75, 10.0, 10.0, 9.60, new Alumno(50L, "Alberto", "Garcia", "04/08/1990")));
        calificaciones.add(new Calificacion(9.0, 9.0, 9.0, 9.0, new Alumno(51L, "Maria", "Rodriguez", "12/01/1990")));
        calificaciones.add(new Calificacion(8.0, 8.0, 8.0, 8.0, new Alumno(52L, "Juan", "Perez", "17/02/1990")));
    }

    public List<Calificacion> obtenerCalificaciones() {
        return calificaciones;
    }


}
