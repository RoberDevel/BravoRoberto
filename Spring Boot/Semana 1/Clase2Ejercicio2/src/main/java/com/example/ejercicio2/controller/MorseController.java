package com.example.ejercicio2.controller;

import com.example.ejercicio2.logic.Morse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @GetMapping("/{frase}")
    public String convertirAMorse(@PathVariable String frase) {

        return Morse.convertir(frase);
    }
}
