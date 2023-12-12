package com.roberdev.ejercicio1.controller;

import com.roberdev.ejercicio1.enums.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RefranController {

    @GetMapping
    public String refran() {

        Refran[] listaRefranes = Refran.values();
        Random random = new Random();
        int posicion = random.nextInt(listaRefranes.length);
        return listaRefranes[posicion].getRefran();

    }

}
