public class Main {

    /*a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
        Asigna un valor a cada variable y muestra su contenido en la consola.

     b) Ahora, asigna valores que no correspondan al tipo de dato.
     Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
     Justificar el por qué de cada caso. Debatir con otros compañeros.*/

    public static void main(String[] args) {

        //Declaramos variables
        int num;
        double num2;
        boolean hasPc;
        String name;

        //Inicializamos variables
        num = 1;
        num2 = 1.3;
        hasPc = true;
        name = "Roberto";

        //name = 5;
        // Al intentar poner un int en un String salta un error y poniendo el cursor encima del error te dice que se requiere un String y lo que has puesto es un int, el IDE te da alguna solución,
        // como por ejemplo añadir el metodo String.valueOf() para que el 5 lo transforme en un String.
        name = String.valueOf(5);
        
        double num3 = 6;
        // No salta error cuando pones un int en un double, pero esto es por que java internamente ya le añade el punto flotante, si ahora pido que muestre la variable num3, aparecerá como 6.0.
        System.out.println(num3);

    }
}