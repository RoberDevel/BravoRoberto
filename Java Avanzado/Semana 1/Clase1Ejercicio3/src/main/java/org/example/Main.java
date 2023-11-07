package org.example;

import org.example.exceptions.VectorExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un vector y acceder a ella posteriormente.
 Tu tarea es implementar una función que te permita almacenar datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño fijo para simplificar el ejercicio.
Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando un índice.
Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder a una posición inválida en el vector.*/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        String[] datos = new String[10];
        Scanner scanner = new Scanner(System.in);
        String i;
        String dato;

        //almacenamos datos
        almacenarDatos(datos);
        System.out.print("Bienvenido al gestor de datos, espere mientas se almacenan los datos");
        for (int j = 0; j < 10; j++) {
            //probando lo que dimos en la clase de hoy
            Thread.sleep(250);
            System.out.print(".");
        }

        System.out.println("\nDatos aleatorios almacenados!!");


        //pedimos al usuario que introduzca el indice
        System.out.println("Introduce el indice del vector para recuperar el valor almacenado.");
        i = scanner.nextLine();

        dato = recuperarDato(i, datos);

        //pintamos el resultado del metodo de recuperar dato, en el caso de que se haya introducido un indice erroneo, saltará la excepcion
        System.out.print("El dato que está en del indice " + i + " es");
        for (int j = 0; j < 5; j++) {
            Thread.sleep(250);
            System.out.print(".");
        }
        System.out.println(" " + dato);

    }

    //metodo para almacenar datos aleatorios
    static void almacenarDatos(String[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = String.valueOf(Math.random() * 1000);
        }
    }

    //metodo para recuperar un dato
    static String recuperarDato(String i, String[] datos) {
        String dato = "";
        //Comprueba que i se pueda transformar a Integer llamando al metodo esNumeroValido
        if (!esNumeroValido(i)) {
            //si no puede salta la excepcion
            throw new InputMismatchException("El valor introducido no es un número");
            //si puede, comprueba que i sea mayor que el tamaño del array
        } else if (Integer.parseInt(i) > datos.length) {
            //si lo es lanza la excepcion
            throw new ArrayIndexOutOfBoundsException("El indice " + i + " es mayor al último indice del array: " + (datos.length - 1));
            //si es menor al tamaño del array, comprueba si es menor a 0
        } else if (Integer.parseInt(i) < 0) {
            //si lo es, lanza la excepcion
            throw new ArrayIndexOutOfBoundsException("El indice " + i + " es menor a 0 (fuera de rango 0 a " + (datos.length - 1) + ")");
            //si tdo está correcto, devuelve el dato requerido
        }
        return datos[Integer.parseInt(i)];
    }

    //metodo para comprobar que cadena se pueda transformar en un Integer
    static boolean esNumeroValido(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}