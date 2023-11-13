package org.example;

import org.example.entity.Evento;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller").
Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los eventos que están programados para una fecha específica.

Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

Encuentra el evento más próximo en el tiempo utilizando Optionals.*/
public class Main {
    public static void main(String[] args) {
        List<String> categorias = List.of("Reunión", "Conferencia", "Taller");
        List<Evento> listaEventos = List.of(
                new Evento("evento1", LocalDate.of(2022, 11, 10), categorias.get(0)),
                new Evento("evento2", LocalDate.of(2023, 2, 15), categorias.get(1)),
                new Evento("evento3", LocalDate.of(2023, 8, 30), categorias.get(2)),
                new Evento("evento4", LocalDate.of(2023, 6, 11), categorias.get(1)),
                new Evento("evento5", LocalDate.of(2023, 7, 2), categorias.get(1)),
                new Evento("evento6", LocalDate.of(2023, 1, 25), categorias.get(2)),
                new Evento("evento7", LocalDate.of(2023, 2, 20), categorias.get(0)),
                new Evento("evento8", LocalDate.of(2023, 11, 10), categorias.get(0)),
                new Evento("evento9", LocalDate.of(2023, 6, 11), categorias.get(2))
        );

        //Filtra los eventos que están programados para una fecha específica.
        listaEventos.stream().filter(e->e.getFecha().equals(LocalDate.of(2023, 6, 11))).toList().forEach(System.out::println);


        System.out.println("----------------------");
        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

        System.out.println("En la categoria \""+categorias.get(0)+"\" hay "+listaEventos.stream().filter(e -> e.getCategoria().equals(categorias.get(0))).count()+" eventos.");
        System.out.println("En la categoria \""+categorias.get(1)+"\" hay "+listaEventos.stream().filter(e -> e.getCategoria().equals(categorias.get(1))).count()+" eventos.");
        System.out.println("En la categoria \""+categorias.get(2)+"\" hay "+listaEventos.stream().filter(e -> e.getCategoria().equals(categorias.get(2))).count()+" eventos.");


        System.out.println("----------------------");
        //Encuentra el evento más próximo en el tiempo utilizando Optionals.
        Optional<Evento> evento = listaEventos.stream().sorted(Comparator.comparing(Evento::getFecha).reversed()).findFirst();
        evento.ifPresentOrElse(System.out::println, ()-> System.out.println("No hay ningun evento en la lista"));

    }
}