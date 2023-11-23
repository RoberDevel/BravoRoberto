package com.trabajos.clase10ejercicio1.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto implements Serializable {

    @Id
    private Long partido;
    private String nombre;
    private String voto;

    public Voto() {
    }

    public Voto(Long partido, String nombre, String voto) {
        this.partido = partido;
        this.nombre = nombre;
        this.voto = voto;
    }

    public Long getPartido() {
        return partido;
    }

    public void setPartido(Long partido) {
        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
}
