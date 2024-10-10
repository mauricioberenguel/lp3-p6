package Modelo;

public class Item 
{
    // Atributo privado que almacena el nombre del item.
    private String nombre;
    // Atributo privado que almacena la cantidad del item.
    private int cantidad;
    // Atributo privado que almacena el tipo del item (Arma o Poción).
    private String tipo; // Puede ser "Arma" o "Poción"
    // Atributo privado que almacena la descripción del item.
    private String descripcion;
    // Constructor de la clase Item.
    // Inicializa los atributos del item con los valores proporcionados.
    public Item(String nombre, int cantidad, String tipo, String descripcion) 
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    // Método para obtener el nombre del item.
    // Devuelve el valor del atributo nombre.
    public String getNombre() 
    {
        return nombre;
    }
    // Método para obtener la cantidad del item.
    // Devuelve el valor del atributo cantidad.
    public int getCantidad() 
    {
        return cantidad;
    }
    // Método para establecer la cantidad del item.
    // Recibe la nueva cantidad como argumento y actualiza el atributo cantidad.
    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }
    // Método para obtener el tipo del item.
    // Devuelve el valor del atributo tipo.
    public String getTipo() 
    {
        return tipo;
    }
    // Método para obtener la descripción del item.
    // Devuelve el valor del atributo descripcion.
    public String getDescripcion() 
    {
        return descripcion;
    }
    // Método para usar el item.
    // Si la cantidad del item es mayor que 0, decrementa la cantidad y muestra un mensaje indicando que se ha usado el item.
    // Si la cantidad del item es 0, muestra un mensaje indicando que no queda más de este item.
    public void usarItem() 
    {
        if (cantidad > 0) 
        {
            cantidad--;
            System.out.println("Has usado el item: " + nombre);
        } 
        else 
        {
            System.out.println("No queda más de este item.");
        }
    }
    // Sobrescribe el método toString() de la clase Object.
    // Devuelve una representación en cadena del objeto Item en formato:
    // "Nombre: nombre, Cantidad: cantidad, Tipo: tipo, Descripción: descripcion"
    @Override
    public String toString() 
    {
        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Tipo: " + tipo + ", Descripción: " + descripcion;
    }
}