import java.time.Year;

public class Moto extends Vehiculo implements Combustion {
    public int cilindrada;
    public String tipoMotor;

    public Moto() {
    }

    public Moto(int id, String placa, String marca, String modelo, int ano, Double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, ano, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void recargarCombustible() {
        System.out.println("Recargando combustible para la moto de combustión.");
    }

    public int antiguedadVehiculo() {
        int year = Year.now().getValue();
        return year - this.getAno();
    }

    public String toString() {
        int var10000 = this.getId();
        return "ID = " + var10000 + ", Placa = " + this.getPlaca() + ", Marca = " + this.getMarca() + ", Modelo = " + this.getModelo() + ", Año = " + this.getAno() + ", Costo = " + this.getCosto() + ", Cilindrada = " + this.cilindrada + ", Tipo de motor = " + this.tipoMotor;
    }
}