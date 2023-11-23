/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajos.clase10ejercicio1.logic;

import com.trabajos.clase10ejercicio1.persistence.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author rober
 */
public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void añadirVoto(String voto) throws Exception {
        controladoraPersistencia.añadirVoto(voto);
    }

    public List<Voto> traerVotos() {
        return controladoraPersistencia.traerVotos();
    }

}
