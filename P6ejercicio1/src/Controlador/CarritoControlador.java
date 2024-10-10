package Controlador;

import Modelo.CarritoModelo;
import Vista.CarritoVista;
import Modelo.Producto;

public class CarritoControlador 
{
    private CarritoModelo modelo;
    private CarritoVista vista;
    public CarritoControlador(CarritoModelo modelo, CarritoVista vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void iniciar() 
    {
        String opcion = "";
        while (!opcion.equals("8")) { // Opción 8 es salir
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();
            switch (opcion) {
                case "1":
                    agregarProducto();
                    break;
                case "2":
                    mostrarCarrito();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    aplicarDescuento();
                    break;
                case "5":
                    calcularEnvio();
                    break;
                case "6":
                    realizarCompra();
                    break;
                case "7":
                    mostrarHistorial();
                    break;
                case "8":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida");
            }
        }
        vista.cerrarScanner();
    }
    private void agregarProducto() 
    {
        String nombre = vista.solicitarNombreProducto();
        double precio = vista.solicitarPrecioProducto();
        Producto producto = new Producto(nombre, precio);
        modelo.agregarProducto(producto);
        vista.mostrarMensaje("Producto agregado correctamente.");
    }
    private void mostrarCarrito() 
    {
        vista.mostrarProductos(modelo.obtenerProductosEnCarrito());
    }
    private void eliminarProducto() 
    {
        String nombre = vista.solicitarNombreProducto();
        modelo.eliminarProducto(nombre);
        vista.mostrarMensaje("Producto eliminado, si existía.");
    }
    private void aplicarDescuento() 
    {
        double descuento = vista.solicitarDescuento();
        double totalConDescuento = modelo.aplicarDescuento(descuento);
        vista.mostrarTotal(totalConDescuento);
    }
    private void calcularEnvio() 
    {
        double costoEnvio = modelo.calcularEnvio();
        vista.mostrarMensaje("El costo de envío es: $" + costoEnvio);
    }
    private void realizarCompra() 
    {
        modelo.realizarCompra();
        vista.mostrarMensaje("Compra realizada exitosamente.");
    }
    private void mostrarHistorial() 
    {
        vista.mostrarHistorialCompras(modelo.obtenerHistorialCompras());
    }
}
