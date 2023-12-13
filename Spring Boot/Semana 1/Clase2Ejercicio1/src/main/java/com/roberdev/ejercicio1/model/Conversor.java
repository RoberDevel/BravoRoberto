package com.roberdev.ejercicio1.model;

public class Conversor {

    public Conversor() {
    }

    public String convertir(String centimetros) {


        try {
            double centimetrosDouble = Double.parseDouble(centimetros);
            double metros = centimetrosDouble / 100;
            return String.valueOf(metros);
        } catch (NumberFormatException e) {
            return "Error: " + centimetros + " no es un número válido";
        }


    }


}
