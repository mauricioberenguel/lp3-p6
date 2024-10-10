package Controlador;

import Modelo.InventarioModel;
import Modelo.Item;
import Vista.InventarioView;

public class InventarioController 
{
    private InventarioModel modelo;
    private InventarioView vista;
    public InventarioController(InventarioModel modelo, InventarioView vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void agregarItem(String nombre, int cantidad, String tipo, String descripcion) 
    {
        Item item = new Item(nombre, cantidad, tipo, descripcion);
        modelo.agregarItem(item);
        vista.mostrarMensaje("Item agregado: " + nombre);
    }
    public void eliminarItem(String nombre) 
    {
        Item item = modelo.buscarItem(nombre);
        if (item != null) 
        {
            modelo.eliminarItem(item);
            vista.mostrarMensaje("Item eliminado: " + nombre);
        } 
        else 
        {
            vista.mostrarMensaje("No se encontró el item: " + nombre);
        }
    }
    public void verInventario() 
    {
        vista.mostrarInventario(modelo.obtenerItems());
    }
    public void mostrarDetalles(String nombre) 
    {
        Item item = modelo.buscarItem(nombre);
        vista.mostrarDetallesItem(item);
    }
    public void buscarItem(String nombre) 
    {
        Item item = modelo.buscarItem(nombre);
        if (item != null) 
        {
            vista.mostrarMensaje("Item encontrado: " + item);
        } 
        else 
        {
            vista.mostrarMensaje("Item no encontrado: " + nombre);
        }
    }
}