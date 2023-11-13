package org.example;

import org.example.entity.Empleado;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente").
Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los empleados cuyo salario sea mayor a cierto valor específico.

Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

Encuentra al empleado con el salario más alto utilizando Optionals.*/
public class Main {
    public static void main(String[] args) {
        List<String> categorias = List.of("Desarrollador", "Analista", "Gerente");
        List<Empleado> listaEmpleados = List.of(
                new Empleado("Roberto", 2500.0, categorias.get(0)),
                new Empleado("Maria", 2750.0, categorias.get(1)),
                new Empleado("Laura", 3500.0, categorias.get(2)),
                new Empleado("Paco", 3000.0, categorias.get(2)),
                new Empleado("Luisina", 2500.0, categorias.get(1)),
                new Empleado("Roque", 3250.0, categorias.get(0)),
                new Empleado("Oscar", 1500.0, categorias.get(0)),
                new Empleado("Sol", 4000.0, categorias.get(2))
        );

        //Filtra los empleados cuyo salario sea mayor a cierto valor específico (2500).
        listaEmpleados.stream().filter(e -> e.getSalario() > 2500).toList().forEach(System.out::println);

        //Agrupa los empleados por categoría y
        List<Empleado> empleadosCat1 = listaEmpleados.stream().filter(e -> e.getCategoria().equalsIgnoreCase("Desarrollador")).toList();
        List<Empleado> empleadosCat2 = listaEmpleados.stream().filter(e -> e.getCategoria().equalsIgnoreCase("Analista")).toList();
        List<Empleado> empleadosCat3 = listaEmpleados.stream().filter(e -> e.getCategoria().equalsIgnoreCase("Gerente")).toList();
        System.out.println("-------------------");


        // calcula el salario promedio para cada categoría.
        empleadosCat1.stream().mapToDouble(p -> p.getSalario()).average().ifPresentOrElse(average -> System.out.println(Math.round(average * 100.0) / 100.0), () -> System.out.println("No hay empleados en esta categoria"));
        empleadosCat2.stream().mapToDouble(p -> p.getSalario()).average().ifPresentOrElse(average -> System.out.println(Math.round(average * 100.0) / 100.0), () -> System.out.println("No hay empleados en esta categoria"));
        empleadosCat3.stream().mapToDouble(p -> p.getSalario()).average().ifPresentOrElse(average -> System.out.println(Math.round(average * 100.0) / 100.0), () -> System.out.println("No hay empleados en esta categoria"));

        System.out.println("-------------------");
        //Encuentra al empleado con el salario más alto utilizando Optionals
        Optional<Empleado> emplado = listaEmpleados.stream().sorted(Comparator.comparingDouble(Empleado::getSalario)).findFirst();

        emplado.ifPresentOrElse(System.out::println, () -> System.out.println("No hay empleados en la lista"));
    }
}