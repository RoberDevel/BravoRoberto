package com.roberdev.ejercicio1.controller;

import com.roberdev.ejercicio1.model.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    Conversor conversor = new Conversor();

    @GetMapping("/{centimetro}")
    public String convertir(@PathVariable String centimetro) {

        return conversor.convertir(centimetro);

    }

}
