public class Main {

    /*Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla..
    Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).*/
    public static void main(String[] args) {
        //variables
        double base = 5;
        double altura = 6;
        double area;

        area = (base * altura) / 2;

        System.out.println("El area del triangulo con base " + base + " y altura " + altura + " es: " + area);

    }

}