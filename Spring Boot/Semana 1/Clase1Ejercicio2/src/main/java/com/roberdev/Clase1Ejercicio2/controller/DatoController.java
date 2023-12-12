package com.roberdev.Clase1Ejercicio2.controller;

import com.roberdev.Clase1Ejercicio2.enums.Dato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DatoController {


    @GetMapping
    public String dato() {


        Dato[] listaDatos = Dato.values();
        Random random = new Random();
        int posicion = random.nextInt(listaDatos.length);
        return listaDatos[posicion].getDato();

    }

}
