package org.example.logic;

import org.example.logic.entity.Tarea;

public class ExploradorTareas {


    public void mostrarTareas(Tarea tarea) {

        System.out.println(tarea.getNombre());

        if (!tarea.getTareas().isEmpty()) {
            System.out.println(tarea.getTareas());
        }
        for (Tarea subTarea : tarea.getTareas()) {
            mostrarTareas(subTarea);
        }
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtarea.getTareas().add(subtarea);
    }

    public void anadirTarea(Tarea tarea, String nombre) {
        if (!tarea.getTareas().isEmpty()) {

            for (Tarea tar : tarea.getTareas()) {
                if (tar.getNombre().equals(nombre)) {
                    tar.getTareas().add(tarea);
                } else System.out.println("No se encontró esa Tarea");
            }

        }


    }

}
