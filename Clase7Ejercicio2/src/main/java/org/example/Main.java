package org.example;

import org.example.logic.Platillo;
import org.example.persistence.PersistenceController;

import java.util.List;

/*Un restaurante necesita un programa para almacenar en una base de datos sus diferentes platillos del menú. De cada uno de estos se almacena: id, nombre, receta, precio.

Sabiendo esto:

Crear una base de datos llamada restaurante. Dejarla completamente vacía.

Realizar las configuraciones necesarias para implementar JPA en el proyecto. Esto incluye:

Mapeo mediante annotations

Creación de la unidad de persistencia

Creación de los paquetes para representar capas (logica y persistencia)

Creación de las clases controladoras: para la lógica y para la persistencia.

Creación de los respectivos JPA Controller.

Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.

Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.

Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.*/
public class Main {
    public static void main(String[] args) {

        PersistenceController controller = new PersistenceController();

        //Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.

        Platillo platillo1 = new Platillo("tortilla", "receta1", 11.99);
        controller.crearPlatillo(platillo1);

//Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
        Platillo platillo2 = new Platillo("lasaña", "receta2", 10.99);
        Platillo platillo3 = new Platillo("pizza", "receta3", 9.99);

        //creamos los platos 2 y 3
        controller.crearPlatillo(platillo2);
        controller.crearPlatillo(platillo3);

        //borramos el plato 2
        controller.borrarPlatillo(platillo2.getId());

        //editamos el plato 3
        platillo3.setNombre("canelones");
        controller.editarPlatillo(platillo3);

        //Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.
        List<Platillo> listado = controller.listarPlatillos();
        for (Platillo platos : listado) {
            System.out.println(platos.toString());
        }


    }
}