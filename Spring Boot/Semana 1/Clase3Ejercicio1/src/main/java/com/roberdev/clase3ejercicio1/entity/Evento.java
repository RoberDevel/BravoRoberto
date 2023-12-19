package com.roberdev.clase3ejercicio1.entity;

import lombok.Data;

@Data
public class Evento {

    private Long id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String hora;
    private String lugar;
    private String ponente;


}
