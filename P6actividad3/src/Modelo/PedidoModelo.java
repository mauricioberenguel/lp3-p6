package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoModelo 
{
    // Atributo privado que almacena una lista de objetos Pedido activos.
    private List<Pedido> pedidos;
    // Atributo privado que almacena una lista de objetos Pedido completados o eliminados.
    private List<Pedido> historialPedidos;  
    // Constructor de la clase PedidoModelo.
    // Inicializa las listas de pedidos y historial de pedidos como nuevas ArrayList.
    public PedidoModelo() 
    {
        pedidos = new ArrayList<>();
        historialPedidos = new ArrayList<>();
    }
    // Método para agregar un nuevo Pedido a la lista de pedidos activos.
    // Recibe un objeto Pedido como argumento y lo agrega a la lista.
    public void agregarPedido(Pedido pedido) 
    {
        pedidos.add(pedido);
    }
    // Método para obtener la lista de Pedidos activos.
    // Devuelve la lista de pedidos.
    public List<Pedido> getPedidos() 
    {
        return pedidos;
    }
    // Método para eliminar un Pedido de la lista de pedidos activos.
    // Recibe el nombre del plato como argumento.
    // Mueve el pedido al historial y lo elimina de la lista activa.
    // Devuelve true si se eliminó el Pedido, false en caso contrario.
    public boolean eliminarPedido(String nombrePlato) 
    {
        Pedido pedido = buscarPedidoPorNombre(nombrePlato);
        if (pedido != null) 
        {
            pedido.setEstado("eliminado");
            historialPedidos.add(pedido);
            pedidos.remove(pedido);
            return true;
        }
        return false;
    }
    // Método para buscar un Pedido por su nombre en la lista de pedidos activos.
    // Recibe el nombre del plato como argumento.
    // Devuelve el objeto Pedido encontrado, o null si no se encuentra.
    public Pedido buscarPedidoPorNombre(String nombrePlato) 
    {
        return pedidos.stream()
            .filter(p -> p.getNombrePlato().equalsIgnoreCase(nombrePlato))
            .findFirst()
            .orElse(null);
    }
    // Método para buscar Pedidos por su tipo en la lista de pedidos activos.
    // Recibe el tipo de plato como argumento.
    // Devuelve una lista de objetos Pedido que coincidan con el tipo.
    public List<Pedido> buscarPedidoPorTipo(String tipoPlato) 
    {
        return pedidos.stream()
            .filter(p -> p.getTipoPlato().equalsIgnoreCase(tipoPlato))
            .collect(Collectors.toList());
    }
    // Método para actualizar un Pedido existente en la lista de pedidos activos.
    // Recibe el nombre actual, el nuevo nombre y el nuevo tipo del plato.
    // Devuelve true si se actualizó el Pedido, false en caso contrario.
    public boolean actualizarPedido(String nombreActual, String nuevoNombre, String nuevoTipo) 
    {
        Pedido pedido = buscarPedidoPorNombre(nombreActual);
        if (pedido != null) 
        {
            pedido.setNombrePlato(nuevoNombre);
            pedido.setTipoPlato(nuevoTipo);
            return true;
        }
        return false;
    }
    // Método para marcar un Pedido como completo en la lista de pedidos activos.
    // Recibe el nombre del plato como argumento.
    // Mueve el pedido al historial y actualiza su estado a "completo".
    // Devuelve true si se marcó el Pedido como completo, false en caso contrario.
    public boolean marcarPedidoComoCompleto(String nombrePlato) 
    {
        Pedido pedido = buscarPedidoPorNombre(nombrePlato);
        if (pedido != null && pedido.isPendiente()) 
        {
            pedido.setEstado("completo");
            historialPedidos.add(pedido);
            return true;
        }
        return false;
    }
    // Método para mostrar los Pedidos por estado.
    // Recibe el estado del pedido como argumento.
    // Devuelve una lista de objetos Pedido que coincidan con el estado.
    public List<Pedido> mostrarPedidosPorEstado(String estado) 
    {
        return pedidos.stream()
            .filter(p -> p.getEstado().equalsIgnoreCase(estado))
            .collect(Collectors.toList());
    }
    // Método para contar la cantidad de Pedidos pendientes en la lista de pedidos activos.
    // Devuelve un long con la cantidad de Pedidos pendientes.
    public long contarPedidosPendientes() 
    {
        return pedidos.stream()
            .filter(Pedido::isPendiente)
            .count();
    }
    // Método para obtener el historial de Pedidos.
    // Devuelve la lista de pedidos completados o eliminados.
    public List<Pedido> getHistorialPedidos() 
    {
        return historialPedidos;
    }
}