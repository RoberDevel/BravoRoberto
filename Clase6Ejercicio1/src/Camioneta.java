
    public class Camioneta extends Vehiculo implements Combustion {

    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return this.capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return this.consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int antiguedadVehiculo() {
        return 2023 - this.getAno();
    }

    public void recargarCombustible() {
        System.out.println("Recargando combustible para la camioneta de combustión.");
    }

    public String toString() {
        int var10000 = this.getId();
        return "ID = " + var10000 + ", Placa = " + this.getPlaca() + ", Marca = " + this.getMarca() + ", Modelo = " + this.getModelo() + ", Año = " + this.getAno() + ", Costo = " + this.getCosto() + ", Capacidad tanque = " + this.capacidadTanque + ", Consumo combustible = " + this.consumoCombustible;
    }
    }
