package org.example.logic.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:
/*Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria
 (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
- Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
- Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
- Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.*/
public class RegistroMascotas<T extends Mascota> {

    private List<T> listaMascotas;


    public RegistroMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    public void agregarMascota(T mascota) {
        listaMascotas.add(mascota);
    }

    public List<T> buscarMascotaPorNombre(String nombre) {
        //devuelve una lista de mascotas con nombre igual al string nombre
        return listaMascotas.stream().filter(m -> m.getNombre().equalsIgnoreCase(nombre)).toList();
    }

    public List<T> buscarMascotaPorEspecie(String especie) {
        //devuelve una lista de mascotas de especie igual al string especie
        return listaMascotas.stream().filter(m -> m.getEspecie().equalsIgnoreCase(especie)).toList();
    }

    public int totalMascotas() {
        //devuelve el tamaño de la lista, o lo que es lo mismo, al total de mascotas
        return listaMascotas.size();
    }


}
