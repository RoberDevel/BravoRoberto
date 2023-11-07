package org.example;

import org.example.exceptions.InventarioExceptions;
import org.example.logic.Inventario;

import java.util.Scanner;

/*Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista.
Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible.
Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.

Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada) o de utilizar los tipos correctos de excepción en cada caso.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario producto = new Inventario();
        String nombre;
        String precio;
        String cantidad;

        System.out.println("Bienvenido al gestor de inventarios");
        System.out.println("Introduzca el nombre del producto");
        nombre = scanner.nextLine();
        System.out.println("Introduzca el precio con formato: \"X\", o \"X.XX\" si quieres añadir centimos");
        precio = scanner.nextLine();
        System.out.println("Introduzca la cantidad de stock");
        cantidad = scanner.nextLine();

        try {
            producto.agregarInventario(nombre, precio, cantidad);
        } catch (InventarioExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}