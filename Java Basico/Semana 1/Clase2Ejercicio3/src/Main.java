import java.util.Scanner;

public class Main {
    /*Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temp = new double[7];
        double average;
        double tempTotal = 0;

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduzca temperatura máxima");
            temp[i] = scanner.nextDouble();
            tempTotal += temp[i];
        }
        average = tempTotal / temp.length;
        System.out.println("La temperatura máxima media es de " + Math.round(average * 100.0) / 100.0 + " grados");


    }
}