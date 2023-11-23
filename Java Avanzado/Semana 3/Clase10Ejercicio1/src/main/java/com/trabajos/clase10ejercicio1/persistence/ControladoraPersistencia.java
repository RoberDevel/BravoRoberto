/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajos.clase10ejercicio1.persistence;

import com.trabajos.clase10ejercicio1.logic.Voto;
import java.util.List;

/**
 *
 * @author rober
 */
public class ControladoraPersistencia {

    VotoJpaController controladora = new VotoJpaController();

    public void añadirVoto(String votoS) throws Exception {
        Voto voto = new Voto();
        int num;
        switch (votoS) {
            case "a":

                if (controladora.findVoto(1L) == null) {
                    voto = new Voto(1L, "Partido A", "1");
                    controladora.create(voto);
                } else {
                    num = Integer.parseInt(controladora.findVoto(1L).getVoto());
                    num++;
                    voto = new Voto(1L, "Partido A", String.valueOf(num));
                    controladora.edit(voto);
                }

                break;
            case "b":
                if (controladora.findVoto(2L) == null) {
                    voto = new Voto(2L, "Partido B", "1");
                    controladora.create(voto);
                } else {
                    num = Integer.parseInt(controladora.findVoto(2L).getVoto());
                    num++;
                    voto = new Voto(2L, "Partido B", String.valueOf(num));
                    controladora.edit(voto);
                }
                break;

            case "c":
                if (controladora.findVoto(3L) == null) {
                    voto = new Voto(3L, "Partido C", "1");
                    controladora.create(voto);
                } else {
                    num = Integer.parseInt(controladora.findVoto(3L).getVoto());
                    num++;
                    voto = new Voto(3L, "Partido C", String.valueOf(num));
                    controladora.edit(voto);
                }
                break;

            default:
                break;
        }

    }

    public List<Voto> traerVotos() {
        return controladora.findVotoEntities();
    }

}
