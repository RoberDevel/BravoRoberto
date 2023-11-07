package org.example.logic;

import java.util.Arrays;

public class Vuelo {

    private String[] destino;
    private int[] fechaViaje;
    private int asientosDisponibles;


    public Vuelo(String[] destino, int[] fechaViaje, int asientosDisponibles) {
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosDisponibles = asientosDisponibles;
    }

    public void setDestino(String[] destino) {
        this.destino = destino;
    }

    public void setFechaViaje(int[] fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public String[] getDestino() {
        return destino;
    }

    public int[] getFechaViaje() {
        return fechaViaje;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }


    public String destinoToString() {
        return Arrays.toString(destino) + " ";
    }

}
