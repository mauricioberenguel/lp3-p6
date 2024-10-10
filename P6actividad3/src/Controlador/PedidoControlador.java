package Controlador;

import java.util.List;
import Modelo.Pedido;
import Modelo.PedidoModelo;
import Vista.PedidoVista;

public class PedidoControlador 
{
    private PedidoModelo modelo;
    private PedidoVista vista;
    public PedidoControlador(PedidoModelo modelo, PedidoVista vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void agregarPedido(String nombrePlato, String tipoPlato) 
    {
        if (!nombrePlato.isEmpty() && !tipoPlato.isEmpty()) 
        {
            modelo.agregarPedido(new Pedido(nombrePlato, tipoPlato));
            vista.mostrarMensaje("Pedido agregado: " + nombrePlato);
        } 
        else 
        {
            vista.mostrarMensaje("El nombre o tipo del plato no puede estar vacío.");
        }
    }
    public void mostrarPedidos() 
    {
        List<Pedido> pedidos = modelo.getPedidos();
        vista.mostrarPedidos(pedidos);
    }
    public void eliminarPedido(String nombrePlato) 
    {
        if (modelo.eliminarPedido(nombrePlato)) {
            vista.mostrarMensaje("Pedido eliminado: " + nombrePlato);
        } 
        else 
        {
            vista.mostrarMensaje("Pedido no encontrado.");
        }
    }
    public void actualizarPedido(String nombreActual, String nuevoNombre, String nuevoTipo) 
    {
        if (modelo.actualizarPedido(nombreActual, nuevoNombre, nuevoTipo)) 
        {
            vista.mostrarMensaje("Pedido actualizado.");
        } 
        else 
        {
            vista.mostrarMensaje("Pedido no encontrado.");
        }
    }

    public void buscarPedidoPorNombre(String nombrePlato) 
    {
        Pedido pedido = modelo.buscarPedidoPorNombre(nombrePlato);
        if (pedido != null) 
        {
            vista.mostrarMensaje("Pedido encontrado: " + pedido.getNombrePlato() + " (Tipo: " + pedido.getTipoPlato() + ", Estado: " + pedido.getEstado() + ")");
        } 
        else 
        {
            vista.mostrarMensaje("Pedido no encontrado.");
        }
    }

    public void buscarPedidoPorTipo(String tipoPlato) {
        List<Pedido> pedidos = modelo.buscarPedidoPorTipo(tipoPlato);
        vista.mostrarPedidos(pedidos);
    }

    public void marcarPedidoComoCompleto(String nombrePlato) 
    {
        if (modelo.marcarPedidoComoCompleto(nombrePlato)) 
        {
            vista.mostrarMensaje("Pedido marcado como completo.");
        } else {
            vista.mostrarMensaje("Pedido no encontrado o ya está completo.");
        }
    }

    public void mostrarPedidosPorEstado(String estado) 
    {
        List<Pedido> pedidos = modelo.mostrarPedidosPorEstado(estado);
        vista.mostrarPedidos(pedidos);
    }

    public void contarPedidosPendientes() 
    {
        long pendientes = modelo.contarPedidosPendientes();
        vista.mostrarMensaje("Total de pedidos pendientes: " + pendientes);
    }

    public void mostrarHistorial() 
    {
        List<Pedido> historial = modelo.getHistorialPedidos();
        vista.mostrarHistorial(historial);
    }

    public void ejecutarAplicacion() 
    {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            String opcion = vista.solicitarOpcion();

            switch (opcion) {
                case "1":
                    String nombrePlato = vista.solicitarNombrePlato();
                    String tipoPlato = vista.solicitarTipoPlato();
                    agregarPedido(nombrePlato, tipoPlato);
                    break;
                case "2":
                    mostrarPedidos();
                    break;
                case "3":
                    nombrePlato = vista.solicitarNombreActual();
                    eliminarPedido(nombrePlato);
                    break;
                case "4":
                    nombrePlato = vista.solicitarNombreActual();
                    String nuevoNombre = vista.solicitarNombrePlato();
                    String nuevoTipo = vista.solicitarTipoPlato();
                    actualizarPedido(nombrePlato, nuevoNombre, nuevoTipo);
                    break;
                case "5":
                    nombrePlato = vista.solicitarNombreActual();
                    buscarPedidoPorNombre(nombrePlato);
                    break;
                case "6":
                    tipoPlato = vista.solicitarTipoPlato();
                    buscarPedidoPorTipo(tipoPlato);
                    break;
                case "7":
                    nombrePlato = vista.solicitarNombreActual();
                    marcarPedidoComoCompleto(nombrePlato);
                    break;
                case "8":
                    String estado = vista.solicitarEstado();
                    mostrarPedidosPorEstado(estado);
                    break;
                case "9":
                    contarPedidosPendientes();
                    break;
                case "10":
                    mostrarHistorial();
                    break;
                case "11":
                    salir = true;
                    vista.mostrarMensaje("Saliendo de la aplicación.");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        }
    }
    // Método que iniciará la aplicación
    public void iniciar() 
    {
        ejecutarAplicacion();
    }
}