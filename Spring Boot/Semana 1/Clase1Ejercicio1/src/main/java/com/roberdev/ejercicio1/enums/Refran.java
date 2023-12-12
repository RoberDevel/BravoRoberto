package com.roberdev.ejercicio1.enums;

public enum Refran {

    REFRAN_1("A caballo regalado no se le mira el diente"),
    REFRAN_2("A Dios rogando y con el mazo dando"),
    REFRAN_3("A enemigo que huye, puente de plata"),
    REFRAN_4("Cuando el cuco llega, entonces es primavera."),
    REFRAN_5("Cuando el río suena, piedras lleva.");

    private final String refran;

    Refran(String refran) {
        this.refran = refran;
    }

    public String getRefran() {
        return refran;
    }


}
