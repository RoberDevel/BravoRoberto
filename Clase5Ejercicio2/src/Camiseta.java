import java.awt.*;

public class Camiseta extends Vestimenta {
    //Camiseta: manga, cuello
    private String manga;
    private String cuello;

    public Camiseta() {
    }

    public Camiseta(int codigo, String nombre, Double precio, String marca, int talla, Color color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Esta camiseta es de manga: " + manga);
    }
}
