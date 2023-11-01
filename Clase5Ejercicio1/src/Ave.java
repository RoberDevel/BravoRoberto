import java.awt.*;

public class Ave extends Animal{
    //"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
    private String envergaduraAlas;
    private String tipoVuelo;
    private Color colorPlumaje;
    private String tipoPico;

    public Ave() {
    }

    public Ave(String envergaduraAlas, String tipoVuelo, Color colorPlumaje, String tipoPico) {
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, String envergaduraAlas, String tipoVuelo, Color colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public String getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(String envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public Color getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(Color colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }
}
