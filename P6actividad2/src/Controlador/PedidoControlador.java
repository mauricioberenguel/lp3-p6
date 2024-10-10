package Controlador;

import java.util.List;
import Modelo.Pedido;
import Modelo.PedidoModelo;
import Vista.PedidoVista;

public class PedidoControlador 
{
    // Atributo privado que almacena el modelo de datos (PedidoModelo).
    private PedidoModelo modelo;
    // Atributo privado que almacena la vista de la aplicación (PedidoVista).
    private PedidoVista vista;
    // Constructor de la clase PedidoControlador.
    // Recibe el modelo y la vista como parámetros.
    public PedidoControlador(PedidoModelo modelo, PedidoVista vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    // Método para agregar un nuevo pedido.
    // Recibe el nombre del plato y el tipo de plato como parámetros.
    public void agregarPedido(String nombrePlato, String tipoPlato) 
    {
        // Verifica si el nombre del plato y el tipo de plato no están vacíos.
        if (!nombrePlato.isEmpty() && !tipoPlato.isEmpty()) 
        {
            // Crea un nuevo objeto Pedido con los datos proporcionados.
            // Agrega el nuevo pedido al modelo.
            modelo.agregarPedido(new Pedido(nombrePlato, tipoPlato));
            // Muestra un mensaje de éxito al usuario.
            vista.mostrarMensaje("Pedido agregado: " + nombrePlato);
        } 
        else 
        {
            // Muestra un mensaje de error al usuario.
            vista.mostrarMensaje("El nombre o tipo del plato no puede estar vacío.");
        }
    }
    // Método para mostrar la lista de pedidos.
    public void mostrarPedidos() 
    {
        // Obtiene la lista de pedidos del modelo.
        List<Pedido> pedidos = modelo.getPedidos();
        // Muestra la lista de pedidos a través de la vista.
        vista.mostrarPedidos(pedidos);
    }
    // Método para eliminar un pedido por su nombre.
    // Recibe el nombre del plato como parámetro.
    public void eliminarPedido(String nombrePlato) 
    {
        // Intenta eliminar el pedido del modelo.
        if (modelo.eliminarPedido(nombrePlato)) 
        {
            // Muestra un mensaje de éxito al usuario.
            vista.mostrarMensaje("Pedido eliminado: " + nombrePlato);
        } 
        else 
        {
            // Muestra un mensaje de error al usuario.
            vista.mostrarMensaje("Pedido no encontrado.");
        }
    }
    // Método para actualizar un pedido existente.
    // Recibe el nombre actual del pedido, el nuevo nombre y el nuevo tipo.
    public void actualizarPedido(String nombreActual, String nuevoNombre, String nuevoTipo) 
    {
        // Intenta actualizar el pedido en el modelo.
        if (modelo.actualizarPedido(nombreActual, nuevoNombre, nuevoTipo)) 
        {
            // Muestra un mensaje de éxito al usuario.
            vista.mostrarMensaje("Pedido actualizado.");
        } 
        else 
        {
            // Muestra un mensaje de error al usuario.
            vista.mostrarMensaje("Pedido no encontrado.");
        }
    }
    // Método para buscar un pedido por su nombre.
    // Recibe el nombre del plato como parámetro.
    public void buscarPedidoPorNombre(String nombrePlato) 
    {
        // Busca el pedido en el modelo.
        Pedido pedido = modelo.buscarPedidoPorNombre(nombrePlato);
        // Si se encuentra el pedido, lo muestra al usuario.
        if (pedido != null) 
        {
            vista.mostrarMensaje("Pedido encontrado: " + pedido.getNombrePlato() + " (Tipo: " + pedido.getTipoPlato() + ")");
        } 
        else 
        {
            // Muestra un mensaje de error al usuario.
            vista.mostrarMensaje("Pedido no encontrado.");
        }
    }
    // Método para buscar pedidos por su tipo.
    // Recibe el tipo de plato como parámetro.
    public void buscarPedidoPorTipo(String tipoPlato) 
    {
        // Busca los pedidos en el modelo.
        List<Pedido> pedidos = modelo.buscarPedidoPorTipo(tipoPlato);
        // Muestra la lista de pedidos encontrados al usuario.
        vista.mostrarPedidos(pedidos);
    }
    // Método para contar el total de pedidos.
    public void contarPedidos() 
    {
        // Obtiene el total de pedidos del modelo.
        long totalPedidos = modelo.contarPedidos();
        // Muestra el total de pedidos al usuario.
        vista.mostrarMensaje("Total de pedidos: " + totalPedidos);
    }
    // Método para contar el total de pedidos por tipo.
    // Recibe el tipo de plato como parámetro.
    public void contarPedidosPorTipo(String tipoPlato) 
    {
        // Obtiene el total de pedidos del tipo especificado.
        long totalPorTipo = modelo.contarPedidosPorTipo(tipoPlato);
        // Muestra el total de pedidos del tipo al usuario.
        vista.mostrarMensaje("Total de pedidos de tipo " + tipoPlato + ": " + totalPorTipo);
    }
    // Método para iniciar la ejecución de la aplicación.
    public void iniciar() 
    {
        // Variable para almacenar la opción seleccionada por el usuario.
        String opcion;
        // Bucle que se ejecuta hasta que el usuario elige la opción de salir.
        do 
        {
            // Muestra el menú de opciones al usuario.
            vista.mostrarMenu();
            // Solicita la opción al usuario.
            opcion = vista.solicitarOpcion();
            // Evalúa la opción seleccionada por el usuario.
            switch (opcion) 
            {
                // Opción 1: Agregar un nuevo pedido.
                case "1":
                    // Solicita el nombre del plato y el tipo de plato al usuario.
                    String nombrePlato = vista.solicitarNombrePlato();
                    String tipoPlato = vista.solicitarTipoPlato();
                    // Agrega el nuevo pedido al modelo.
                    agregarPedido(nombrePlato, tipoPlato);
                    break;
                // Opción 2: Mostrar la lista de pedidos.
                case "2":
                    // Muestra la lista de pedidos.
                    mostrarPedidos();
                    break;
                // Opción 3: Eliminar un pedido por su nombre.
                case "3":
                    // Solicita el nombre del pedido a eliminar al usuario.
                    String nombreEliminar = vista.solicitarNombreActual();
                    // Elimina el pedido del modelo.
                    eliminarPedido(nombreEliminar);
                    break;
                // Opción 4: Actualizar un pedido existente.
                case "4":
                    // Solicita el nombre actual del pedido, el nuevo nombre y el nuevo tipo al usuario.
                    String nombreActual = vista.solicitarNombreActual();
                    String nuevoNombre = vista.solicitarNombrePlato();
                    String nuevoTipo = vista.solicitarTipoPlato();
                    // Actualiza el pedido en el modelo.
                    actualizarPedido(nombreActual, nuevoNombre, nuevoTipo);
                    break;
                // Opción 5: Buscar un pedido por su nombre.
                case "5":
                    // Solicita el nombre del pedido a buscar al usuario.
                    String nombreBuscar = vista.solicitarNombrePlato();
                    // Busca el pedido en el modelo.
                    buscarPedidoPorNombre(nombreBuscar);
                    break;
                // Opción 6: Buscar pedidos por su tipo.
                case "6":
                    // Solicita el tipo de pedido a buscar al usuario.
                    String tipoBuscar = vista.solicitarTipoPlato();
                    // Busca los pedidos en el modelo.
                    buscarPedidoPorTipo(tipoBuscar);
                    break;
                // Opción 7: Contar el total de pedidos.
                case "7":
                    // Cuenta el total de pedidos en el modelo.
                    contarPedidos();
                    // Solicita el tipo de pedido a contar al usuario.
                    String tipoContar = vista.solicitarTipoPlato();
                    // Cuenta el total de pedidos del tipo especificado.
                    contarPedidosPorTipo(tipoContar);
                    break;
                // Opción 8: Salir de la aplicación.
                case "8":
                    // Muestra un mensaje de despedida al usuario.
                    vista.mostrarMensaje("Saliendo...");
                    break;
                // Opción inválida.
                default:
                    // Muestra un mensaje de error al usuario.
                    vista.mostrarMensaje("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!opcion.equals("8"));
        // Cierra el objeto Scanner para liberar recursos.
        vista.cerrarScanner();
    }
}