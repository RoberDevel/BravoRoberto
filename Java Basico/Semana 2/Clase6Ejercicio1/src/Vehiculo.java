import java.util.Calendar;

//Clase realizada por Roberto Bravo
public abstract class Vehiculo {

    /*Clase Abstracta Vehiculo:
    Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo.
    Establecer un método abstracto para calcular la antigüedad del vehiculo.*/

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private Double costo;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, String marca, String modelo, int ano, Double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public int antiguedadVehiculo(){
        Calendar cal = Calendar.getInstance();
        int anoActual = cal.get(Calendar.YEAR);
        int antiguedad;
        antiguedad=anoActual - ano;

        return antiguedad;

    };

}


