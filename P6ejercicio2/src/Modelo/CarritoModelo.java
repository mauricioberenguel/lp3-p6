package Modelo;

import java.util.List;

public class CarritoModelo 
{
    // Atributo privado que almacena un objeto Carrito para gestionar el carrito de compras.
    private Carrito carrito;
    // Constructor de la clase CarritoModelo.
    // Inicializa el objeto Carrito como un nuevo Carrito.
    public CarritoModelo() 
    {
        carrito = new Carrito();
    }
    // Método para agregar un producto al carrito.
    // Recibe un objeto Producto como argumento y lo agrega al carrito.
    public void agregarProducto(Producto producto) 
    {
        carrito.agregarProducto(producto);
    }
    // Método para eliminar un producto del carrito por su nombre.
    // Recibe el nombre del producto como argumento y lo elimina del carrito.
    public void eliminarProducto(String nombreProducto) 
    {
        carrito.eliminarProducto(nombreProducto);
    }
    // Método para obtener la lista de productos en el carrito.
    // Devuelve la lista de productos del carrito.
    public List<Producto> obtenerProductosEnCarrito() 
    {
        return carrito.getProductos();
    }
    // Método para realizar la compra.
    // Realiza la compra en el carrito.
    public void realizarCompra() 
    {
        carrito.realizarCompra();
    }
    // Método para obtener el historial de compras.
    // Devuelve el historial de compras del carrito.
    public List<Producto> obtenerHistorialCompras() 
    {
        return carrito.getHistorialCompras();
    }
    // Método para calcular el total del carrito.
    // Devuelve el total calculado por el carrito.
    public double calcularTotal() 
    {
        return carrito.calcularTotal();
    }
    // Método para aplicar un descuento al total del carrito.
    // Recibe el porcentaje de descuento como argumento y devuelve el total con descuento.
    public double aplicarDescuento(double porcentajeDescuento) 
    {
        return carrito.aplicarDescuento(porcentajeDescuento);
    }
    // Método para calcular el costo de envío.
    // Devuelve el costo de envío calculado por el carrito.
    public double calcularEnvio() 
    {
        return carrito.calcularEnvio();
    }
}