package com.roberdev.clase3ejercicio1.controller;

import com.roberdev.clase3ejercicio1.entity.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EventoController {

    private List<Evento> listaEventos = new ArrayList<>();
    private Long id = 1L;

    @GetMapping("/eventos")
    public List<Evento> listarEventos() {
        return listaEventos;
    }

    @PostMapping("/evento")
    public Evento crearEvento(@RequestBody Evento evento) {
        evento.setId(id++);
        listaEventos.add(evento);
        return evento;
    }

    @GetMapping("/evento/{id}")
    public Evento obtenerEventoPorId(@PathVariable Long id) {


        return listaEventos.stream().filter(evento -> evento.getId().equals(id)).findFirst().get();
    }


}
