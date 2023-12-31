public class Producto {
    // siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private Double precioCosto;
    private Double precioVenta;
    private int cantStock;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String marca, String tipo, Double precioCosto, Double precioVenta, int cantStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantStock = cantStock;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                ", cantStock=" + cantStock +
                '}';
    }
}
