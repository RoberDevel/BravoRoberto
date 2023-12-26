package com.roberdev.clase5ejercicio1.service;

import com.roberdev.clase5ejercicio1.dto.CalAlumDTO;
import com.roberdev.clase5ejercicio1.entity.Alumno;
import com.roberdev.clase5ejercicio1.entity.Calificacion;
import com.roberdev.clase5ejercicio1.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalificacionService implements ICalificacionService {


    @Autowired
    private CalificacionRepository calRepository;


    @Override
    public List<Alumno> obtenerEstudiantes() {

        List<Calificacion> listaCalificaciones = calRepository.obtenerCalificaciones();


        return listaCalificaciones.stream().map(Calificacion::getAlumno).collect(Collectors.toList());
    }

    @Override
    public Calificacion obtenerCalificacionesPorNumMatricula(Long numMatricula) {

        List<Calificacion> listaCalificaciones = calRepository.obtenerCalificaciones();

        return listaCalificaciones.stream().filter(cal -> cal.getAlumno().getNumMatricula().equals(numMatricula)).findFirst().get();
    }

    @Override
    public List<CalAlumDTO> obtenerCalificacionesOrdenDesc() {

        List<Calificacion> listaCalificaciones = calRepository.obtenerCalificaciones();

        return listaCalificaciones.stream()
                .map(calificacion -> new CalAlumDTO(
                        calificacion.getCalificacion1(),
                        calificacion.getCalificacion2(),
                        calificacion.getCalificacion3(),
                        calificacion.getPromedio(),
                        calificacion.getAlumno().getNombre()
                ))
                .sorted((cal1, cal2) -> Double.compare(cal2.getPromedio(), cal1.getPromedio()))
                .collect(Collectors.toList());
    }


}

