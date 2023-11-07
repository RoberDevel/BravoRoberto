//Case creada por Iván Zambrana
public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private int autonomia;

    public Auto(int id, String placa, String marca, String modelo, int ano, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, ano, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return this.capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int antiguedadVehiculo() {
        return 2023 - this.getAno();
    }

    public void cargarEnergia() {
        System.out.println("Cargando energía para el auto eléctrico.");
    }

    public String toString() {
        int var10000 = this.getId();
        return "ID = " + var10000 + ", Placa = " + this.getPlaca() + ", Marca = " + this.getMarca() + ", Modelo = " + this.getModelo() + ", Año = " + this.getAno() + ", Costo = " + this.getCosto() + ", Capacidad batería = " + this.capacidadBateria + ", Autonomía = " + this.autonomia;
    }
}