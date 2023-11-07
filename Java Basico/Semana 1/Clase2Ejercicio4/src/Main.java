import java.util.Scanner;

public class Main {

    //Trabajo realizado junto con Ivan Zambrana

    /*Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
    Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
    Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
    Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
    A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
    Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
    El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
    Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.*/

    public static void main(String[] args) {

        char[][] mapaAsientos = new char[5][5];
        int fila;
        int asiento;
        boolean continuar = true;
        String salir = "n";
        Scanner scan = new Scanner(System.in);

        //Rellenamos la matriz con asientos vacios 'O'
        for (int i = 0; i < mapaAsientos.length; i++) {
            for (int j = 0; j < mapaAsientos.length; j++) {
                mapaAsientos[i][j] = 'O';
            }
        }

        System.out.println("Bienvenido");
        //Loop con condición para saber si termina o no el programa
        while (continuar) {
            //Se pide la fila
            System.out.println("Introduzca el numero de fila que quiere reservar (entre 1 y 5)");
            fila = scan.nextInt();
            //comprobacion de si la fila se escribió entre el rango correcto
            while (fila < 1 || fila > 5) {
                //si no se vuelve a pedir
                System.out.println("Fila erronea, introduzca la fila entre 1 y 5");
                fila = scan.nextInt();
            }
            //si si, se pide el asiento
            System.out.println("Introduzca el número de asiento que quiere reservar (entre 1 y 5)");
            asiento = scan.nextInt();
            //comprobacion de si el asiento se escribió entre el rango correcto
            while (asiento < 1 || asiento > 5) {
                //si no se vuelve a pedir
                System.out.println("Asiento erroneo, introduzca el asiento entre 1 y 5");
                asiento = scan.nextInt();
            }
            //si si, se comprueba si el asiento está ocupado
            if (mapaAsientos[fila - 1][asiento - 1] == 'X') {
                System.out.print("Asiento ocupado. ");
                //si no está ocupado se le agrega el valor X de ocupado a la matriz
            } else {
                mapaAsientos[fila - 1][asiento - 1] = 'X';
                // se pinta la matriz
                for (int i = 0; i < mapaAsientos.length; i++) {
                    for (int j = 0; j < mapaAsientos.length; j++) {

                        System.out.print(mapaAsientos[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
                System.out.println("Gracias! Ha reservado Su asiento, recuerde, eL asiento es " + asiento + " en la fila " + fila + ".");
                //se pregunta si desea salir del programa
                System.out.println("Desea salir del programa o quiere continuar reservando asientos? Escriba s para salir o n para reservar");
                salir = scan.next();
                //se comprueba que se haya escrito s o n
                while (!salir.equals("s") && !salir.equals("n")) {
                    //si no se vuelve a pedir
                    System.out.println("Por favor, escriba s para salir y n para reservar");
                    salir = scan.next();
                }
                //si se escribe s se cierra el programa cambiando la condicion del loop
                if (salir.equals("s")) {
                    System.out.println("Gracias por su reserva, hasta pronto!");
                    continuar = false;
                }
            }
        }
    }
}