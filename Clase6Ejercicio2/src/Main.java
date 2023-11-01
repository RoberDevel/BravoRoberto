import java.util.ArrayList;

public class Main {

    /*Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario.
    Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

A partir de esto, realizar las siguientes acciones en el programa desarrollado:

a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

b) Guardar estos objetos creados en un ArrayList.

c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.

g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.*/

    public static void main(String[] args) {

        int id = 0;
        ArrayList<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto(1, "telefono", "xiaomi", "plegable", 500.0, 800.0, 30);
        Producto producto2 = new Producto(2, "portatil", "acer", "ultrabook", 600.0, 1000.0, 10);
        Producto producto3 = new Producto(3, "pc", "asus", "sobremesa", 950.0, 1500.0, 6);
        Producto producto4 = new Producto(4, "monitor", "asus", "gaming", 300.0, 400.0, 60);
        Producto producto5 = new Producto(5, "tablet", "samsung", "IPS", 400.0, 600.0, 17);
        Producto producto = new Producto(0, "", "", "", 0.0, 0.0, 0);
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);

        //c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        for (Producto productos : listaProductos) {

            if (producto.getPrecioVenta() < productos.getPrecioVenta()) {
                producto = productos;
            }
        }
        System.out.println(producto.toString());

        //e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

        listaProductos.remove(4);

        //f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.

        for (int i = 0; i < listaProductos.size(); i++) {
            if (producto.getCantStock() < listaProductos.get(i).getCantStock()) {
                id = i;
            }
        }
        listaProductos.get(id).setCantStock(listaProductos.get(id).getCantStock() - 3);
        System.out.println(listaProductos.get(id));

        
    }
}