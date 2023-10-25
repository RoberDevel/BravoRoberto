import java.util.Scanner;

public class Main {
    /*a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
    a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
    El programa debe mostrar (según cada caso) un mensaje informando la situación.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int entrada;
        System.out.println("Introduzca su edad");
        entrada=scanner.nextInt();
        
        if(entrada<18){
            System.out.println("Usted es menor de edad, no puede entrar.");
        }else System.out.println("Es mayor de edad, puede pasar.");
    }
}