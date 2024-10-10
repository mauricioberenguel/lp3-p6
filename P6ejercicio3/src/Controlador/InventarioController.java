package Controlador;

import Modelo.InventarioModel;
import Modelo.Item;
import Vista.InventarioView;

public class InventarioController 
{
    // Atributo privado que almacena el modelo de datos del inventario.
    private InventarioModel modelo;
    // Atributo privado que almacena la vista del inventario.
    private InventarioView vista;
    // Constructor de la clase InventarioController.
    // Recibe el modelo y la vista como parámetros.
    public InventarioController(InventarioModel modelo, InventarioView vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    // Método para agregar un nuevo item al inventario.
    // Recibe el nombre, cantidad, tipo y descripción del item como argumentos.
    public void agregarItem(String nombre, int cantidad, String tipo, String descripcion) 
    {
        // Crea un nuevo objeto Item con los datos proporcionados.
        Item item = new Item(nombre, cantidad, tipo, descripcion);
        // Llama al método agregarItem() del modelo para agregar el item al inventario.
        modelo.agregarItem(item);
        // Muestra un mensaje de éxito al usuario a través de la vista.
        vista.mostrarMensaje("Item agregado: " + nombre);
    }
    // Método para eliminar un item del inventario.
    // Recibe el nombre del item a eliminar como argumento.
    public void eliminarItem(String nombre) 
    {
        // Busca el item por nombre utilizando el método buscarItem() del modelo.
        Item item = modelo.buscarItem(nombre);
        // Si el item se encuentra, lo elimina del inventario utilizando el método eliminarItem() del modelo.
        if (item != null) 
        {
            modelo.eliminarItem(item);
            vista.mostrarMensaje("Item eliminado: " + nombre);
        } 
        else 
        {
            // Si el item no se encuentra, muestra un mensaje de error al usuario a través de la vista.
            vista.mostrarMensaje("No se encontró el item: " + nombre);
        }
    }
    // Método para ver el inventario completo.
    public void verInventario() 
    {
        // Obtiene la lista de items del modelo utilizando el método obtenerItems().
        // Muestra el inventario completo al usuario a través de la vista.
        vista.mostrarInventario(modelo.obtenerItems());
    }
    // Método para mostrar los detalles de un item.
    // Recibe el nombre del item como argumento.
    public void mostrarDetalles(String nombre) 
    {
        // Busca el item por nombre utilizando el método buscarItem() del modelo.
        Item item = modelo.buscarItem(nombre);
        // Muestra los detalles del item al usuario a través de la vista.
        vista.mostrarDetallesItem(item);
    }
    // Método para buscar un item en el inventario.
    // Recibe el nombre del item a buscar como argumento.
    public void buscarItem(String nombre) 
    {
        // Busca el item por nombre utilizando el método buscarItem() del modelo.
        Item item = modelo.buscarItem(nombre);
        // Si el item se encuentra, muestra un mensaje de éxito al usuario a través de la vista.
        if (item != null) 
        {
            vista.mostrarMensaje("Item encontrado: " + item);
        } 
        else 
        {
            // Si el item no se encuentra, muestra un mensaje de error al usuario a través de la vista.
            vista.mostrarMensaje("Item no encontrado: " + nombre);
        }
    }
}