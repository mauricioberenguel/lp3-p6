package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Producto 
{
    // Atributo privado que almacena el nombre del producto.
    private String nombre;
    // Atributo privado que almacena el precio del producto.
    private double precio;
    // Atributo privado que almacena una lista de reseñas del producto.
    private List<Reseña> reseñas;
    // Constructor de la clase Producto.
    // Inicializa el nombre y el precio del producto con los valores proporcionados.
    // También inicializa la lista de reseñas como una nueva ArrayList.
    public Producto(String nombre, double precio) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.reseñas = new ArrayList<>();
    }
    // Método para obtener el nombre del producto.
    // Devuelve el valor del atributo nombre.
    public String getNombre() 
    {
        return nombre;
    }
    // Método para obtener el precio del producto.
    // Devuelve el valor del atributo precio.
    public double getPrecio() 
    {
        return precio;
    }
    // Método para agregar una reseña al producto.
    // Recibe un objeto Reseña como argumento y lo agrega a la lista de reseñas.
    public void agregarReseña(Reseña reseña) 
    {
        reseñas.add(reseña);
    }
    // Método para obtener la lista de reseñas del producto.
    // Devuelve la lista de reseñas.
    public List<Reseña> getReseñas() 
    {
        return reseñas;
    }
    // Sobrescribe el método toString() de la clase Object.
    // Devuelve una representación en cadena del objeto Producto en formato:
    // "nombre - Precio: $precio"
    @Override
    public String toString() 
    {
        return nombre + " - Precio: $" + precio;
    }
}