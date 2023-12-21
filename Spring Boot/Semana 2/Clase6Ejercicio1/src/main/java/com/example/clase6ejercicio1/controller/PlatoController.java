package com.example.clase6ejercicio1.controller;

import com.example.clase6ejercicio1.dto.PlatoDTO;
import com.example.clase6ejercicio1.dto.ResultDTO;
import com.example.clase6ejercicio1.service.PlatoService;
import com.example.clase6ejercicio1.service.PlatoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")
public class PlatoController {

    @Autowired
    PlatoService platoService;


    @GetMapping("/plato/{nombrePlato}")
    public ResultDTO obtenerPlato(@PathVariable String nombrePlato) {


        return platoService.obtenerPlato(nombrePlato);


    }


}
