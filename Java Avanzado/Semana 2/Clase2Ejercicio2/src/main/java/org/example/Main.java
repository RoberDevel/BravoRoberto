package org.example;
/*Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una clase genérica Mascota<T> con atributos como nombre, edad, y especie
(no olvides el código o id de mascota para identificar a cada una). Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:
- Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria
 (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
- Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
- Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
- Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.*/

import org.example.logic.entity.Mascota;
import org.example.logic.entity.RegistroMascotas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        RegistroMascotas listaMascotas = new RegistroMascotas<>();

        //se generan datos aleatorios y se añaden a la lista de mascotas
        generarDatosAleatorios(generarTotalMascotas(), listaMascotas);

        //se buscan mascotas por tipo de especie
        System.out.println("Mascotas de especie Ave: ");
        listaMascotas.buscarMascotaPorEspecie("Ave").forEach(System.out::println);

        //se buscan mascotas por nombre
        System.out.println("Mascotas llamadas Max: ");
        listaMascotas.buscarMascotaPorNombre("Max").forEach(System.out::println);

        //se muestra el total de mascotas
        System.out.println("Total de mascotas: " + listaMascotas.totalMascotas());

    }


    static void generarDatosAleatorios(int cantidad, RegistroMascotas lista) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            Integer id = i;
            String nombre = generarNombreAleatorio();
            int edad = random.nextInt(10) + 1;

            String especie = generarEspecieAleatorio();

            Mascota mascota = new Mascota(id, nombre, edad, especie);
            lista.agregarMascota(mascota);
        }
    }
    
    static String generarNombreAleatorio() {
        String[] nombres = {"Max", "Luna", "Toby", "Bella", "Rocky", "Coco", "Charlie", "Lucy", "Milo", "Daisy"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

    static String generarEspecieAleatorio() {
        String[] especies = {"Perro", "Gato", "Ave", "Reptil"};
        Random random = new Random();
        return especies[random.nextInt(especies.length)];
    }

    //metodo que genera un numero entre 5 y 20 inclusivos
    static int generarTotalMascotas() {
        Random random = new Random();
        return random.nextInt(21) + 5;
    }

}