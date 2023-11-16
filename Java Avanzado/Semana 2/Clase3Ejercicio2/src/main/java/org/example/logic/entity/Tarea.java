package org.example.logic.entity;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private String nombre;
    private List<Tarea> subtareasLista;


    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareasLista = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return subtareasLista;
    }

    public void setTareas(List<Tarea> tareas) {
        this.subtareasLista = tareas;
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareasLista.add(subtarea);
    }

    public static Tarea buscarTarea(List<Tarea> tareas, String nombreBuscado) {
        for (Tarea tarea : tareas) {
            if (tarea.nombre.equals(nombreBuscado)) {
                return tarea;
            }
        }
        return null;
    }

    public void mostrarEstructura() {
        mostrarEstructura(this, 0);
    }

    private void mostrarEstructura(Tarea tarea, int nivel) {
        System.out.println("Nivel " + nivel + ": " + tarea.nombre);
        for (Tarea subtarea : tarea.subtareasLista) {
            mostrarEstructura(subtarea, nivel + 1);
        }

    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", subtareasLista=" + subtareasLista +
                '}';
    }
}
