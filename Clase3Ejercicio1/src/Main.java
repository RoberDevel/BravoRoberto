import java.awt.*;

public class Main {
    /*Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.

Luego, realiza las siguientes acciones:

a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.

d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?*/

    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[4];
        //a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        electrodomesticos[0] = new Electrodomestico(1, "samsung", "A345", 10.5, Color.blue);
        electrodomesticos[1] = new Electrodomestico(2, "bosch", "b335", 10.5, Color.white);
        electrodomesticos[2] = new Electrodomestico(3, "aeg", "4315", 10.5, Color.black);

        //b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        electrodomesticos[3] = new Electrodomestico();

        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        for (int i = 0; i < 3; i++) {
            System.out.println(electrodomesticos[i].toString());
        }
        //d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?*/
        System.out.println(electrodomesticos[3]);
        //El resultado es:
        //Electrodomestico{, marca='null', modelo='null', consumo=0.0}
        //Al no haberle asignado valores, pinta un valor predeterminado, el predeterminado de un String es null, mientras que el de un int es 0

    }
}