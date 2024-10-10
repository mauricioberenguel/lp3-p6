package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrito 
{
    // Atributo privado que almacena una lista de productos en el carrito.
    private List<Producto> productos;
    // Atributo privado que almacena una lista de productos comprados (historial).
    private List<Producto> historialCompras;
    // Constructor de la clase Carrito.
    // Inicializa las listas de productos y historial de compras como nuevas ArrayList.
    public Carrito() 
    {
        productos = new ArrayList<>();
        historialCompras = new ArrayList<>();
    }
    // Método para agregar un producto al carrito.
    // Recibe un objeto Producto como argumento y lo agrega a la lista de productos.
    public void agregarProducto(Producto producto) 
    {
        productos.add(producto);
    }
    // Método para eliminar un producto del carrito por su nombre.
    // Recibe el nombre del producto como argumento y lo elimina de la lista de productos.
    public void eliminarProducto(String nombreProducto) 
    {
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombreProducto));
    }
    // Método para obtener la lista de productos en el carrito.
    // Devuelve la lista de productos.
    public List<Producto> getProductos() 
    {
        return productos;
    }
    // Método para realizar la compra.
    // Mueve los productos del carrito al historial de compras y vacía el carrito.
    public void realizarCompra() 
    {
        historialCompras.addAll(productos);
        productos.clear(); // Vaciamos el carrito tras la compra
    }
    // Método para obtener el historial de compras.
    // Devuelve la lista de productos comprados.
    public List<Producto> getHistorialCompras() 
    {
        return historialCompras;
    }
    // Método para calcular el total del carrito.
    // Devuelve la suma de los precios de todos los productos en el carrito.
    public double calcularTotal() 
    {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
    // Método para aplicar un descuento al total del carrito.
    // Recibe el porcentaje de descuento como argumento y devuelve el total con descuento.
    public double aplicarDescuento(double porcentajeDescuento) 
    {
        return calcularTotal() * ((100 - porcentajeDescuento) / 100);
    }
    // Método para calcular el costo de envío.
    // Devuelve un precio fijo de envío.
    public double calcularEnvio() 
    {
        return 10.0; // Precio fijo de envío
    }
}