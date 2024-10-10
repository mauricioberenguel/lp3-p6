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
    public void agregarPedido(String nombrePlato) 
    {
        if (!nombrePlato.isEmpty()) 
        {
            modelo.agregarPedido(new Pedido(nombrePlato));
            vista.mostrarMensaje("Pedido agregado: " + nombrePlato);
        } 
        else 
        {
            vista.mostrarMensaje("El nombre del plato no puede estar vacío.");
        }
    }

    public void mostrarPedidos() 
    {
        List<Pedido> pedidos = modelo.getPedidos();
        vista.mostrarPedidos(pedidos);
    }

    public void iniciar() 
    {
        String opcion;
        do 
        {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();
            switch (opcion) 
            {
                case "1":
                    String nombrePlato = vista.solicitarNombrePlato();
                    agregarPedido(nombrePlato);
                    break;
                case "2":
                    mostrarPedidos();
                    break;
                case "3":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!opcion.equals("3"));
        vista.cerrarScanner();
    }
}