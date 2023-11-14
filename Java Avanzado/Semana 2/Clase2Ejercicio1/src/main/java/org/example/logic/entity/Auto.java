package org.example.logic.entity;

// Crea una clase Auto con atributos como marca, modelo, año, y precio.
public class Auto {

    private String marca;
    private String modelo;
    private String ano;
    private Double precio;

    public Auto(String marca, String modelo, String ano, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", precio=" + precio +
                '}';
    }
}
