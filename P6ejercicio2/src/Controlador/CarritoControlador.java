package Controlador;

import java.util.List;
import Modelo.CarritoModelo;
import Modelo.Producto;
import Vista.CarritoVista;

public class CarritoControlador 
{
    // Atributo privado que almacena el modelo de datos del carrito.
    private CarritoModelo modelo;
    // Atributo privado que almacena la vista del carrito.
    private CarritoVista vista;
    // Constructor de la clase CarritoControlador.
    // Recibe el modelo y la vista como parámetros.
    public CarritoControlador(CarritoModelo modelo, CarritoVista vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    // Método para iniciar la ejecución de la aplicación.
    public void iniciar() 
    {
        // Variable para controlar la salida del bucle principal.
        boolean salir = false;
        // Bucle principal de la aplicación.
        while (!salir) 
        {
            // Muestra el menú de opciones al usuario.
            vista.mostrarMenu();
            // Solicita la opción al usuario.
            String opcion = vista.solicitarOpcion();
            // Evalúa la opción seleccionada por el usuario.
            switch (opcion) 
            {
                // Opción 1: Agregar un nuevo producto al carrito.
                case "1":
                    // Solicita el nombre y el precio del producto al usuario.
                    String nombreProducto = vista.solicitarNombreProducto();
                    double precioProducto = vista.solicitarPrecioProducto();
                    // Crea un nuevo objeto Producto y lo agrega al modelo.
                    modelo.agregarProducto(new Producto(nombreProducto, precioProducto));
                    // Muestra un mensaje de éxito al usuario.
                    vista.mostrarMensaje("Producto agregado: " + nombreProducto);
                    break;
                // Opción 2: Mostrar los productos en el carrito y el total.
                case "2":
                    // Obtiene la lista de productos del modelo.
                    List<Producto> productos = modelo.obtenerProductosEnCarrito();
                    // Muestra los productos y el total a través de la vista.
                    vista.mostrarProductos(productos);
                    vista.mostrarTotal(modelo.calcularTotal());
                    break;
                // Opción 3: Eliminar un producto del carrito.
                case "3":
                    // Solicita el nombre del producto a eliminar al usuario.
                    nombreProducto = vista.solicitarNombreProducto();
                    // Elimina el producto del modelo.
                    modelo.eliminarProducto(nombreProducto);
                    // Muestra un mensaje de éxito al usuario.
                    vista.mostrarMensaje("Producto eliminado: " + nombreProducto);
                    break;
                // Opción 4: Aplicar un descuento al total.
                case "4":
                    // Solicita el descuento al usuario.
                    double descuento = vista.solicitarDescuento();
                    // Aplica el descuento al total en el modelo.
                    double totalConDescuento = modelo.aplicarDescuento(descuento);
                    // Muestra el total con descuento a través de la vista.
                    vista.mostrarTotal(totalConDescuento);
                    break;
                // Opción 5: Mostrar el costo de envío.
                case "5":
                    // Muestra el costo de envío calculado por el modelo.
                    vista.mostrarMensaje("Costo de envío: $" + modelo.calcularEnvio());
                    break;
                // Opción 6: Realizar la compra.
                case "6":
                    // Realiza la compra en el modelo.
                    modelo.realizarCompra();
                    // Muestra un mensaje de éxito al usuario.
                    vista.mostrarMensaje("Compra realizada.");
                    break;
                // Opción 7: Mostrar el historial de compras.
                case "7":
                    // Obtiene el historial de compras del modelo.
                    List<Producto> historial = modelo.obtenerHistorialCompras();
                    // Muestra el historial de compras a través de la vista.
                    vista.mostrarHistorialCompras(historial);
                    break;
                // Opción 8: Salir de la aplicación.
                case "8":
                    // Establece la variable salir en true para salir del bucle principal.
                    salir = true;
                    // Muestra un mensaje de despedida al usuario.
                    vista.mostrarMensaje("Saliendo de la aplicación.");
                    break;
                // Opción inválida.
                default:
                    // Muestra un mensaje de error al usuario.
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        }
    }
    // Método para agregar un producto al carrito.
    // Recibe un objeto Producto como argumento y lo agrega al modelo.
    public void agregarProducto(Producto producto) 
    {
        this.modelo.agregarProducto(producto);
    }
}