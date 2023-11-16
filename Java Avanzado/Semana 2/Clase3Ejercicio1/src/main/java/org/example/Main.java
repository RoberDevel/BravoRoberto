package org.example;

/*Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un sistema operativo utilizando una estructura de datos propia.
Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.
El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.
Pistas:
Puedes utilizar una clase Directorio para cada una de las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos

class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    // Constructor, métodos para agregar subdirectorios y archivos, etc.
}
Puedes utilizar una clase "ExploradorDirectorios" con un método "explorarDirectorio" que sirva para la recursividad.*/

public class Main {
    public static void main(String[] args) {


        ExploradorDirectorios exploradorDirectorios = new ExploradorDirectorios();
        Directorio directorio = new Directorio("Directorio Principal");

        directorio.anadirSubdirectorio(new Directorio("Subdirectorio 1.1"));
        directorio.anadirSubdirectorio(new Directorio("Subdirectorio 1.2"));
        directorio.anadirSubdirectorio(new Directorio("Subdirectorio 1.3"));
        directorio.anadirArchivos("Archivo 1");
        directorio.anadirArchivos("Archivo 2");
        directorio.anadirArchivos("Archivo 3");
        directorio.getSubdirectorios().get(0).anadirSubdirectorio(new Directorio("Subdirectorio 1.1.1"));
        directorio.getSubdirectorios().get(0).anadirSubdirectorio(new Directorio("Subdirectorio 1.1.2"));
        directorio.getSubdirectorios().get(0).anadirSubdirectorio(new Directorio("Subdirectorio 1.1.3"));
        directorio.getSubdirectorios().get(0).anadirArchivos("Foto2.jpg");
        directorio.getSubdirectorios().get(0).anadirArchivos("trabajo.pdf");
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(0).anadirSubdirectorio(new Directorio("Subdirectorio 1.1.1.1"));
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(0).anadirArchivos("Matematicas.txt");
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(0).anadirSubdirectorio(new Directorio("Subdirectorio 1.1.1.2"));
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(1).anadirArchivos("Ciencias.xml");
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(0).getSubdirectorios().get(0).anadirSubdirectorio(new Directorio("Subdirectorio 1.1.1.1.1"));
        directorio.getSubdirectorios().get(2).anadirSubdirectorio(new Directorio("Subdirectorio 1.3.1"));
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(0).anadirArchivos("archivo oculto");
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(0).anadirArchivos("archivo oculto 2");
        directorio.getSubdirectorios().get(2).anadirSubdirectorio(new Directorio("Subdirectorio1.3.2"));
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(1).anadirArchivos("manzana wallpaper.jpg");
        directorio.getSubdirectorios().get(0).getSubdirectorios().get(1).anadirArchivos("pera wallpaper.jpg");

        exploradorDirectorios.explorarDirectorio(directorio);


    }
}