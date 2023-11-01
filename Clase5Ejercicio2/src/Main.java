import java.awt.*;

public class Main {
    /*Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

Zapato: material, tipoCierre

Pantalon: estilo, tipoTejido

Camiseta: manga, cuello

Sombrero: tipo, tamaño

b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
(crear un objeto con parámetros para cada uno de ellos).

c) Crear los siguientes métodos (en cada subclase correspondiente):

Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.*/
    public static void main(String[] args) {

        //b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
        //(crear un objeto con parámetros para cada uno de ellos).
        Vestimenta[] listaVestimentas = new Vestimenta[9];
        listaVestimentas[0] = new Zapato(1, "bota", 19.99, "nike", 39, Color.black, "algodon", "cordon");
        listaVestimentas[1] = new Zapato(2, "playero", 20.00, "adidas", 39, Color.blue, "cuero", "cordon");
        listaVestimentas[2] = new Zapato(3, "botin", 50.99, "reebok", 39, Color.red, "nylon", "cremallera");
        listaVestimentas[3] = new Pantalon(4, "jean", 24.99, "zara", 39, Color.black, "vaquero", "algodon");
        listaVestimentas[4] = new Pantalon(5, "slim", 30.00, "pull&bear", 39, Color.pink, "denim", "denim");
        listaVestimentas[5] = new Pantalon(6, "pana", 39.99, "levi's", 39, Color.ORANGE, "wide", "algodon");
        listaVestimentas[6] = new Camiseta(7, "camiseta basica", 19.99, "pull&bear", 39, Color.gray, "corta", "alto");
        listaVestimentas[7] = new Camiseta(8, "camiseta de rayas", 17.99, "zara", 39, Color.lightGray, "larga", "bajo");
        listaVestimentas[8] = new Sombrero(9, "gorra", 15.99, "adidas", 39, Color.YELLOW, "tejano", "grande");

        //d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.*/


        //Recorremos el array y llamamos al metodo mostrarMensaje()
        for (int i = 0; i < listaVestimentas.length; i++) {
            listaVestimentas[i].mostrarMensaje();
        }
    }
}