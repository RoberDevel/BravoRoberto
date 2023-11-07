package org.example.logic;

import org.example.exceptions.InventarioExceptions;

//Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible.
//Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.
public class Inventario {
    private String nombre;
    private Double precio;
    private int cantidad;

    public Inventario() {
    }

    public Inventario(String nombre, Double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void agregarInventario(String nombre, String precio, String cantidad) throws InventarioExceptions {

        //comprobamos que el nombre no esté vacio
        if (nombre.isEmpty()) {
            //si está vacio lanzamos la excepcion
            throw new InventarioExceptions("Error: Nombre vacio");

        }
        //si está correcto almacenamos nombre
        else this.nombre = nombre;

        //comprobamos que el precio se pueda transformar en Double llamando al metodo esNumeroValido
        if (!esNumeroValido(precio)) {
            //si no lo es lanzamos la excepcion
            throw new InventarioExceptions("Error: No se introdujo un numero en precio");

        } else {
            //en el caso de que lo sea, comprobamos que precio sea mayor a 0
            if (Double.parseDouble(precio) <= 0) {
                //si no lo es lanzamos la excepcion
                throw new InventarioExceptions("Error: el precio es 0 o menor");

            }
            //si tdo está correcto almacenamos el precio con dos decimales
            else this.precio = Math.round(Double.parseDouble(precio) * 100.0) / 100.0;
        }
        //comprobamos que cantidad se pueda transformar en Double llamando al metodo esNumeroValido, aunque cantidad sea un int, el metodo nos sirve
        if (!esNumeroValido(cantidad)) {
            //si no lo es lanzamos la excepcion
            throw new InventarioExceptions("Error: No se introdujo un numero en cantidad");
            //si es un Double, comprobamos que cantidad sea menor a 0
        } else {
            if (Integer.parseInt(cantidad) <= 0) {
                //si lo es lanzamos la excepcion
                throw new InventarioExceptions("Error: la cantidad es 0 o menor");
                //si tdo está correcto almacenamos cantidad
            } else this.cantidad = Integer.parseInt(cantidad);
        }
        //pintamos el producto almacenado
        System.out.println("Almacenado el producto \"" + this.nombre + "\" con precio " + this.precio + " y cantidad " + this.cantidad + ".");
    }


    @Override
    public String toString() {
        return "Inventario{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

    //metodo que comprueba si el String pasado por parametro se puede transformar en un Double
    public static boolean esNumeroValido(String cadena) {
        try {

            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
