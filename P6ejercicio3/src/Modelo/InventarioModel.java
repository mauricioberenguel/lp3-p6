package Modelo;

import java.util.ArrayList;
import java.util.List;

public class InventarioModel 
{
    // Atributo privado que almacena una lista de objetos Item que representan el inventario.
    private List<Item> items;
    // Constructor de la clase InventarioModel.
    // Inicializa la lista de items como una nueva ArrayList.
    public InventarioModel() 
    {
        items = new ArrayList<>();
    }
    // Método para agregar un nuevo item al inventario.
    // Recibe un objeto Item como argumento y lo agrega a la lista de items.
    public void agregarItem(Item item) 
    {
        items.add(item);
    }
    // Método para eliminar un item del inventario.
    // Recibe un objeto Item como argumento y lo elimina de la lista de items.
    public void eliminarItem(Item item) 
    {
        items.remove(item);
    }
    // Método para obtener la lista de items del inventario.
    // Devuelve la lista de items.
    public List<Item> obtenerItems() 
    {
        return items;
    }
    // Método para buscar un item en el inventario por su nombre.
    // Recibe el nombre del item como argumento y lo busca en la lista de items.
    // Si encuentra el item, lo devuelve; de lo contrario, devuelve null.
    public Item buscarItem(String nombre) 
    {
        for (Item item : items) 
        {
            if (item.getNombre().equalsIgnoreCase(nombre)) 
            {
                return item;
            }
        }
        return null;
    }
}