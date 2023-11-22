package com.trabajos.ejerintegradorjsp_jpa.persistence;

import com.trabajos.ejerintegradorjsp_jpa.logic.Equipo;
import com.trabajos.ejerintegradorjsp_jpa.logic.Partido;
import java.util.List;

public class ControladoraPersistencia {

    EquipoJpaController controladorEquipo = new EquipoJpaController();
    PartidoJpaController controladorPartido = new PartidoJpaController();

    public void añadirEquipo(Equipo equipo) {

        controladorEquipo.create(equipo);

    }

    public void añadirPartido(Partido partido, Long idEquipo1, Long idEquipo2) {

        Equipo equipo1 = controladorEquipo.findEquipo(idEquipo1);
        Equipo equipo2 = controladorEquipo.findEquipo(idEquipo2);

        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        controladorPartido.create(partido);

    }

    public List<Equipo> mostrarEquipos() {
        List<Equipo> equipos = controladorEquipo.findEquipoEntities();

        return equipos;
    }

    public List<Partido> mostrarPartidos() {
        List<Partido> partidos = controladorPartido.findPartidoEntities();

        return partidos;
    }

}
