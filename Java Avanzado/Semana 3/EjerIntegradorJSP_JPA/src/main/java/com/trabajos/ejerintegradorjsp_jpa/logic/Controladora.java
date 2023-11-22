/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajos.ejerintegradorjsp_jpa.logic;

import com.trabajos.ejerintegradorjsp_jpa.persistence.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author rober
 */
public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void añadirEquipo(Equipo equipo) {
        controladoraPersistencia.añadirEquipo(equipo);
    }

    public List<Equipo> mostrarEquipos() {

        return controladoraPersistencia.mostrarEquipos();

    }

    public List<Partido> mostrarPartidos() {

        return controladoraPersistencia.mostrarPartidos();

    }

    public void añadirPartido(Partido partido, Long puntos1, Long puntos2) {
        controladoraPersistencia.añadirPartido(partido, puntos1, puntos2);
    }

}
