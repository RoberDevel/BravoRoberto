package org.example;

import org.example.exceptions.ReservaInvalidaException;
import org.example.logic.Reserva;
import org.example.logic.Vuelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea.
Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje y número de asientos deseados.
Tu tarea es implementar una función de reserva de vuelos que valide los datos ingresados y maneje excepciones si los datos son incorrectos o si no hay suficientes asientos disponibles en el vuelo.

Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en situaciones excepcionales,
como cuando un usuario intenta reservar más asientos de los disponibles o si falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String fecha = "";
        String destino = "";
        String asientos = "";
        int[] dias = new int[30];
        for (int i = 0; i < dias.length; i++) {
            dias[i] = i + 1;
        }
        Vuelo vuelo = new Vuelo(new String[]{"madrid", "barcelona", "nueva york"}, dias, 50);
        Reserva reserva = new Reserva();


        System.out.println("Bienvenido a reservas.com");

        System.out.println("Introduzca su nombre");
        nombre = scanner.nextLine();

        System.out.println("Introduzca el destino entre: " + vuelo.destinoToString());
        destino = scanner.nextLine().toLowerCase();

        System.out.println("Introduzca el numero de dia que quiere reservar entre 1 y 31");
        fecha = scanner.nextLine();


        System.out.println("Introduzca cuantos asientos quiere");
        asientos = scanner.nextLine();

        try {
            reserva.reservarAsientos(nombre, destino, fecha, asientos, vuelo);
        } catch (ReservaInvalidaException e) {
            System.out.println(e.getMessage());
        }

      /*  try {
            vuelo.reservarAsientos(nombre, fecha, asientos);
            //vuelo.reservarAsientos("Ana García", "2023-12-15", 3);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: " + e.getMessage());
        }*/
    }

}