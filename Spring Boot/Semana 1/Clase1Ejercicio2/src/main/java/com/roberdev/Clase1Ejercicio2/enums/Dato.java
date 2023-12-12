package com.roberdev.Clase1Ejercicio2.enums;

public enum Dato {

    DATO_1("Los conejos bebé se llaman gazapos. ¡Qué bonito!"),
    DATO_2("La nuez moscada es un alucinógeno. La especia contiene miristicina, un compuesto natural que " +
            "tiene efectos alteradores de la mente si se ingiere en grandes dosis."),
    DATO_3("El gorro de cocinero tiene 100 pliegues. Al parecer, pretende representar las 100 formas en que se puede cocinar un huevo."),
    DATO_4("El libro \"A la recherche du temps perdu\", de Marcel Proust, contiene unos 9.609.000 caracteres, lo que lo convierte en el libro más largo del mundo. El título se traduce como \"Recuerdo de las cosas pasadas\"."),
    DATO_5("Los actores que ponen voz a Mickey y Minnie se han casado en la vida real. Russi Taylor (Minnie) y Wayne Allwine (Mickey) se casaron en 1991.");


    private String dato;

    Dato(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }
}
