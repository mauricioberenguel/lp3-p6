package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoModelo 
{
    // Atributo privado que almacena una lista de objetos Pedido.
    private List<Pedido> pedidos;
    // Constructor de la clase PedidoModelo.
    // Inicializa la lista de pedidos como una nueva ArrayList.
    public PedidoModelo() 
    {
        pedidos = new ArrayList<>();
    }
    // Método para agregar un nuevo Pedido a la lista.
    // Recibe un objeto Pedido como argumento y lo agrega a la lista.
    public void agregarPedido(Pedido pedido) 
    {
        pedidos.add(pedido);
    }
    // Método para obtener la lista de Pedidos.
    // Devuelve la lista de pedidos.
    public List<Pedido> getPedidos() 
    {
        return pedidos;
    }
    // Método para eliminar un Pedido de la lista por su nombre.
    // Recibe el nombre del plato como argumento.
    // Devuelve true si se eliminó el Pedido, false en caso contrario.
    public boolean eliminarPedido(String nombrePlato) 
    {
        return pedidos.removeIf(p -> p.getNombrePlato().equalsIgnoreCase(nombrePlato));
    }
    // Método para buscar un Pedido por su nombre.
    // Recibe el nombre del plato como argumento.
    // Devuelve el objeto Pedido encontrado, o null si no se encuentra.
    public Pedido buscarPedidoPorNombre(String nombrePlato) 
    {
        return pedidos.stream()
            .filter(p -> p.getNombrePlato().equalsIgnoreCase(nombrePlato))
            .findFirst()
            .orElse(null);
    }
    // Método para buscar Pedidos por su tipo.
    // Recibe el tipo de plato como argumento.
    // Devuelve una lista de objetos Pedido que coincidan con el tipo.
    public List<Pedido> buscarPedidoPorTipo(String tipoPlato) 
    {
        return pedidos.stream()
            .filter(p -> p.getTipoPlato().equalsIgnoreCase(tipoPlato))
            .collect(Collectors.toList());
    }
    // Método para actualizar un Pedido existente.
    // Recibe el nombre actual, el nuevo nombre y el nuevo tipo del plato.
    // Devuelve true si se actualizó el Pedido, false en caso contrario.
    public boolean actualizarPedido(String nombreActual, String nuevoNombre, String nuevoTipo) 
    {
        Pedido pedido = buscarPedidoPorNombre(nombreActual);
        if (pedido != null) {
            pedido.setNombrePlato(nuevoNombre);
            pedido.setTipoPlato(nuevoTipo);
            return true;
        }
        return false;
    }
    // Método para contar la cantidad total de Pedidos.
    // Devuelve un long con la cantidad de Pedidos en la lista.
    public long contarPedidos() 
    {
        return pedidos.size();
    }
    // Método para contar la cantidad de Pedidos por tipo.
    // Recibe el tipo de plato como argumento.
    // Devuelve un long con la cantidad de Pedidos que coinciden con el tipo.
    public long contarPedidosPorTipo(String tipoPlato) 
    {
        return pedidos.stream()
            .filter(p -> p.getTipoPlato().equalsIgnoreCase(tipoPlato))
            .count();
    }
}
