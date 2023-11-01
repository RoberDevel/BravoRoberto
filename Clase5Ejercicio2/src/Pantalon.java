import java.awt.*;

public class Pantalon extends Vestimenta {
    //Pantalon: estilo, tipoTejido
    private String estilo;
    private String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(int codigo, String nombre, Double precio, String marca, int talla, Color color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Estos pantalones son de estilo: " + estilo);
    }
}
