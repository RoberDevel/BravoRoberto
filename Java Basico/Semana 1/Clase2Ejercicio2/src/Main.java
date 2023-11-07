import java.util.Scanner;

public class Main {
    /*a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.

Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad=1;
        boolean hayMas=true;
        double precio;
        double total=0;

        //Entramos en un bucle donde la condición es si hay más productos
        while(hayMas){
            //Pedimos la cantidad del siguiente producto
            System.out.println("Introduzca cantidad de producto, si no hay más escribe 0");
            cantidad=scanner.nextInt();
            //comprobamos que la cantidad no sea negativa
            if (cantidad < 0) {
                System.out.println("La cantidad debe ser un número entero positivo");
                //si la cantidad es 0 significa que no hay más productos, ponemos la condición a false y saldremos del loop
            } else if (cantidad == 0) {
                hayMas = false;
                //si la cantidad es mayor a 0 pediremos el precio y le añadiremos al total el resultado de cantidad por precio
            } else {

                System.out.println("Introduzca precio del producto");
                precio = scanner.nextDouble();
                total += cantidad * precio;
            }
        }
        //Mostramos la cantidad a abonar
        System.out.println("Cantidad a abonar: "+total);

    }
}