package org.example;

import org.example.logic.entity.Auto;
import org.example.logic.entity.InventarioAutos;

import java.util.List;

/*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio.
Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:

Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.

Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.

Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.*/
public class Main {
    public static void main(String[] args) {

        InventarioAutos<Auto> lista = new InventarioAutos<>();
        lista.agregarAutos(new Auto("Mercedes", "clase A", "2000", 2000.0));
        lista.agregarAutos(new Auto("Bmw", "Serie 1", "2005", 3000.0));
        lista.agregarAutos(new Auto("Toyota", "Corolla", "2009", 2500.0));
        lista.agregarAutos(new Auto("Mercedes", "Clase C", "2017", 2500.0));
        lista.agregarAutos(new Auto("Cadillac", "Escalade", "2017", 2500.0));
        lista.agregarAutos(new Auto("Porsche", "Cayman", "2008", 2500.0));

        System.out.println("Listado de Mercedes: " + lista.buscarAutosPorMarca("Mercedes"));
        System.out.println("Listado de coches del 2017: " + lista.buscarAutosPorAno("2017"));
        System.out.println("Valor total: " + lista.valorTotal() + " €");


    }
}