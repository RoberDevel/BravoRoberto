package org.example;

import org.example.logic.Trabajador;

/* Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.
• Cada trabajador se representa como un hilo independiente.
• Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
• Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
• Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.*/
public class Main {
    public static void main(String[] args) {

        int trabajadores = 4;

        for (int i = 0; i <= trabajadores; i++) {
            Trabajador trabajador = new Trabajador(i + 1);
            Thread hilo = new Thread(trabajador);
            hilo.setPriority((int) ((Math.random() * 10) + 1));
            hilo.start();
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
}