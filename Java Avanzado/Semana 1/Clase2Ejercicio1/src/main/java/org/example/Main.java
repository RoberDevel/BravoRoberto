package org.example;
/*• Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender llamadas telefónicas concurrentemente.
• Cada agente se representa como un hilo independiente.
• Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada.
Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de manera eficiente.
• Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.*/


import org.example.logic.Agente;
import org.example.logic.Llamada;

public class Main {
    public static void main(String[] args) {
        // Número de agentes disponibles
        int numAgentes = 5;
        // Array con numero de llamadas aleatorias entre 2 y 10
        Llamada[] llamadas = new Llamada[(int) ((Math.random() * 9) + 2)];

        // Se crean los agentes
        Agente[] agentes = new Agente[numAgentes];

        //y se inician y empiezan
        for (int i = 0; i < numAgentes; i++) {
            agentes[i] = new Agente(i);
            agentes[i].start();
        }

        // se simulan las llamadas
        for (int i = 0; i < llamadas.length; i++) {
            llamadas[i] = new Llamada("" + (i + 1));
            synchronized (agentes[i % numAgentes]) {
                agentes[i % numAgentes].atenderLlamada(llamadas[i]);
            }
            try {
                // se simula el intervalo entre llamadas
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //si hay algún error, el hilo se interrumpe
                Thread.currentThread().interrupt();
            }
        }
    }
}
