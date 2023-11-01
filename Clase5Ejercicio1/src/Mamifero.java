import java.awt.*;

public class Mamifero extends Animal {
    //"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.

    private int numPatas;
    private String tipoReproduccion;
    private Color colorPelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numPatas, String tipoReproduccion, Color colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public Mamifero(int numPatas, String tipoReproduccion, Color colorPelaje, String habitat) {
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public Color getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(Color colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamifero");
    }
}
