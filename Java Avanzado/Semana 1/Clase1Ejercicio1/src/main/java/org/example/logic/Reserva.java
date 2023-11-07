package org.example.logic;

import org.example.exceptions.ReservaInvalidaException;

import java.util.ArrayList;
import java.util.List;

//Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje y número de asientos deseados.
public class Reserva {
    private int id;
    private String nombre;
    private String destino;
    private int fechaViaje;
    private int asientosReservados = 50;

    private Vuelo vuelo;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, int fechaViaje, int asientosDisponibles, Vuelo vuelo) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosReservados = asientosDisponibles;
        this.vuelo = vuelo;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaViaje(int fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosReservados = asientosDisponibles;
    }

    public void reservarAsientos(String nombre, String destino, String fechaViaje, String numAsientos, Vuelo vuelo) throws ReservaInvalidaException {

        if (nombre.isEmpty()) {
            throw new ReservaInvalidaException("Error: Nombre vacio");
        } else if (nombre.matches(".*[0-9].*")) {
            throw new ReservaInvalidaException("Error: Nombre con numeros");
        } else this.nombre = nombre;

        boolean foundDestino = false;
        for (String destinos : vuelo.getDestino()) {
            if (destinos.equals(destino)) {
                foundDestino = true;
                break;
            }
        }
        if (!foundDestino) {

            throw new ReservaInvalidaException("Destino incorrecto, los destinos son: " + vuelo.destinoToString().toUpperCase());
        } else
            this.destino = destino;

        boolean foundDate = false;

        boolean isNumber = esNumeroValido(fechaViaje);


        if (isNumber) {
            for (int fecha : vuelo.getFechaViaje()) {
                if (fecha == Integer.parseInt(fechaViaje)) {
                    foundDate = true;
                    break;
                }
            }
            if (!foundDate) {
                throw new ReservaInvalidaException("Fecha " + fechaViaje + " fuera de rango: " + vuelo.getFechaViaje()[0] + " - " + (vuelo.getFechaViaje().length - 1));
            } else
                this.fechaViaje = Integer.parseInt(fechaViaje);
        } else throw new ReservaInvalidaException("Error: No ha introducido un numero en la fecha");

        isNumber = esNumeroValido(numAsientos);

        if (isNumber) {
            if (Integer.parseInt(numAsientos) <= 0) {
                throw new ReservaInvalidaException("Error: el numero de asientos es menor a 0");
            } else if (Integer.parseInt(numAsientos) > 50) {
                throw new ReservaInvalidaException("Error: valor superior al total de asientos disponibles: " + vuelo.getAsientosDisponibles());
            } else
                this.asientosReservados = asientosReservados -= Integer.parseInt(numAsientos);
        } else throw new ReservaInvalidaException("Error: no ha introducido un numero para numero de asientos");


        System.out.println("Estimado " + this.nombre + ", gracias por reservar con nosotros, la información de su reserva es:\ndestino: " + this.destino + " \ndia: " + this.fechaViaje + "\nnumero de asientos reservados: " + numAsientos);
    }

    public static boolean esNumeroValido(String cadena) {
        try {

            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
