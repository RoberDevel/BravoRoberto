import java.awt.*;

public class Vestimenta {
    //Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).
    private int codigo;
    private String nombre;
    private Double precio;
    private String marca;
    private int talla;
    private Color color;

    public Vestimenta() {
    }

    public Vestimenta(int codigo, String nombre, Double precio, String marca, int talla, Color color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void mostrarMensaje(){}
}
