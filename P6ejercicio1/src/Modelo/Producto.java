package Modelo;

public class Producto 
{
    // Atributo privado que almacena el nombre del producto.
    private String nombre;
    // Atributo privado que almacena el precio del producto.
    private double precio;
    // Constructor de la clase Producto.
    // Inicializa el nombre y el precio del producto con los valores proporcionados.
    public Producto(String nombre, double precio) 
    {
        this.nombre = nombre;
        this.precio = precio;
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
    // Sobrescribe el método toString() de la clase Object.
    // Devuelve una representación en cadena del objeto Producto en formato:
    // "nombre - Precio: $precio"
    @Override
    public String toString() 
    {
        return nombre + " - Precio: S/. " + precio;
    }
}