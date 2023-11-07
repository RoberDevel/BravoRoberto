import java.awt.*;

public class Sombrero extends Vestimenta {
    //Sombrero: tipo, tamaño
    private String tipo;
    private String tamano;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, Double precio, String marca, int talla, Color color, String tipo, String tamano) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Este sombrero es de tipo: " + tipo);
    }
}
