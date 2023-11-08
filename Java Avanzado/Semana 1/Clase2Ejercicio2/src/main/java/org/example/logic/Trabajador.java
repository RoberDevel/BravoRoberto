package org.example.logic;

//Cada trabajador se representa como un hilo independiente.
//• Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
public class Trabajador extends Thread {

    private int numTrabajador;

    public Trabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "numTrabajador=" + numTrabajador +
                '}';
    }

    @Override
    public void run() {

        ensamblarProducto();
        controlCalidad();
        empaquetarProducto();

    }

    synchronized void ensamblarProducto() {
        try {
            System.out.print("El trabajador " + numTrabajador + " está ensamblando el paquete");

            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(750);

            }

            System.out.println("\nEl trabajador " + numTrabajador + " ha terminado de ensamblar el paquete");

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void controlCalidad() {
        System.out.println("El trabajador " + numTrabajador + " empieza a realizar el control de calidad");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("El trabajador " + numTrabajador + " ha terminado de realizar el control de calidad");
    }

    synchronized void empaquetarProducto() {
        try {
            System.out.print("El trabajador " + numTrabajador + " está empaquetando el producto");

            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(250);
            }

            System.out.println("\nEl trabajador " + numTrabajador + " ha terminado de empaquetar el producto");

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
