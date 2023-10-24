import java.util.Scanner;

public class Main {
    /*Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división.
    Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
    Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?*/

    public static void main(String[] args) {
        double num1, num2, suma, resta, multiplicacion, division;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número");
        num1 = scan.nextInt();

        System.out.println("Por favor, introduzca otro número");
        num2 = scan.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;

        if (num2 == 0) {
            System.out.println("El resultado de la suma es: " + suma + ",\nEl resultado de la resta es: " + resta + "\nEl resultado de la multiplicación es: " + multiplicacion +
                    "\nNo se puede calcular el resultado de la división, ya que no se puede dividir un número entre 0");
        } else {
            division = num1 / num2;

            System.out.println("El resultado de la suma es: " + suma + ",\nEl resultado de la resta es: " + resta + "\nEl resultado de la multiplicación es: " + multiplicacion +
                    "\nEl resultado de la división es: " + Math.round(division * 100.0) / 100.0);
        }
    }
}