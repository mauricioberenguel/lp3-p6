package Modelo;

import java.util.ArrayList;
import java.util.List;
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
}