import java.awt.*;

public class Zapato extends Vestimenta {
    //Zapato: material, tipoCierre
    private String material;
    private String tipoCierre;

    public Zapato() {
    }

    public Zapato(int codigo, String nombre, Double precio, String marca, int talla, Color color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }
    //Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).


    @Override
    public void mostrarMensaje() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }
}
