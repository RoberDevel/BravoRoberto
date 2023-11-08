package org.example.logic;

//• Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada.
public class Agente extends Thread {

    private int numAgente;

    public Agente(int numeroAgente) {
        this.numAgente = numeroAgente;
    }

    public int getNumAgente() {
        return numAgente;
    }

    public void setNumAgente(int numAgente) {
        this.numAgente = numAgente;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "numAgente=" + numAgente +
                '}';
    }

    public synchronized void atenderLlamada(Llamada llamada) {

        System.out.println("El agente " + (numAgente + 1) + " atiende la llamada " + llamada.getNombre());
        // se simula la duracion de la llamada
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //cuando finaliza se pinta que el agente terminó la llamada
        System.out.println("El agente " + (numAgente + 1) + " termina la llamada " + llamada.getNombre());
    }
}
