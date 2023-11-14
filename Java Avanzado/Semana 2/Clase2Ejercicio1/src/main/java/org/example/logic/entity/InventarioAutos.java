package org.example.logic.entity;

import java.util.ArrayList;
import java.util.List;

/*Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.*/
public class InventarioAutos<T extends Auto> {

    private List<T> inventarioAutos;

    public InventarioAutos() {
        this.inventarioAutos = new ArrayList<>();
    }

    public void agregarAutos(T auto) {
        inventarioAutos.add(auto);
    }

    public List<T> buscarAutosPorAno(String ano) {

        return inventarioAutos.stream().filter(l -> l.getAno().equals(ano)).toList();

    }

    public List<T> buscarAutosPorMarca(String marca) {

        return inventarioAutos.stream().filter(l -> l.getMarca().equals(marca)).toList();

    }

    public Double valorTotal() {


        return inventarioAutos.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();

    }

}
