package org.example;

import org.example.logic.ExploradorTareas;
import org.example.logic.entity.Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear una estructura jerárquica de tareas.
Cada tarea puede tener subtareas asociadas, y estas subtareas también pueden tener sus propias subtareas, creando así una estructura de "árbol de tareas".

El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva.
Además, debe ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas subtareas.

📝Extra Point (OPCIONAL): En caso que quieras agregar un poco de "arte" al ejercicio, puedes proponer que las estructuras que se muestren por pantalla sean dibujadas mediante ascii. */
public class Main {
    public static void main(String[] args) {

        Tarea tareaPrincipal = new Tarea("");
        Scanner scanner = new Scanner(System.in);
        ExploradorTareas exploradorTareas = new ExploradorTareas();
        String opcion = "";
        tareaPrincipal.agregarSubtarea(new Tarea("Tarea1"));
        tareaPrincipal.agregarSubtarea(new Tarea("Tarea2"));
        tareaPrincipal.agregarSubtarea(new Tarea("Tarea3"));
        tareaPrincipal.getTareas().get(0).agregarSubtarea(new Tarea("Tarea1-1"));


        System.out.println("Si desea visualizar tareas pulse \"1\", para añadir una tarea principal pulse \"2\", para añadir una subtarea pulse \"3\", pulse otra tecla para salir");
        opcion = scanner.nextLine();
        if (opcion.equals("1")) {


            tareaPrincipal.mostrarEstructura();


        } else if (opcion.equals("2")) {

            System.out.println("Introduzca el nombre de la tarea");
            String nombre = scanner.nextLine();
            Tarea tarea = new Tarea(nombre);
            tareaPrincipal.getTareas().add(tarea);
            tareaPrincipal.mostrarEstructura();

        } else if (opcion.equals("3")) {
            System.out.println("Introduce el nombre que le quieres poner a la tarea");
            String n = scanner.nextLine();
            Tarea tarea = new Tarea(n);
            System.out.println("Introduzca el nombre de la tarea principal");
            String tP = scanner.nextLine();
            exploradorTareas.anadirTarea(tarea, tP);
            exploradorTareas.mostrarTareas(tareaPrincipal);

        }

    }


}
