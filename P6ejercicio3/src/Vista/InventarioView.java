package Vista;

import java.util.List;
import Modelo.Item;

public class InventarioView 
{
    // Método para mostrar el inventario completo.
    // Recibe una lista de objetos Item como argumento.
    public void mostrarInventario(List<Item> items) 
    {
        // Si la lista de items está vacía, muestra un mensaje indicando que el inventario está vacío.
        if (items.isEmpty()) 
        {
            System.out.println("El inventario está vacío.");
        } 
        else 
        {
            // Si la lista de items no está vacía, muestra un encabezado "Inventario:" y luego itera sobre la lista.
            System.out.println("Inventario:");
            for (Item item : items) 
            {
                // Imprime la información del item utilizando el método toString() del objeto Item.
                System.out.println(item);
            }
        }
    }
    // Método para mostrar un mensaje al usuario.
    // Recibe un mensaje como argumento y lo imprime en la consola.
    public void mostrarMensaje(String mensaje) 
    {
        System.out.println(mensaje);
    }
    // Método para mostrar los detalles de un item.
    // Recibe un objeto Item como argumento.
    public void mostrarDetallesItem(Item item) 
    {
        // Si el item no es null, muestra un encabezado "Detalles del Item:" y luego imprime la información del item utilizando el método toString() del objeto Item.
        if (item != null) 
        {
            System.out.println("Detalles del Item:");
            System.out.println(item);
        } 
        else {
            // Si el item es null, muestra un mensaje indicando que el item no existe.
            System.out.println("El item no existe.");
        }
    }
}