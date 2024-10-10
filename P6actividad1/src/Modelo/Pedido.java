package Modelo;

public class Pedido 
{
    // Atributo privado que almacena el nombre del plato del pedido.
     private String nombrePlato;
    // Constructor de la clase Pedido.
    // Inicializa el atributo nombrePlato con el valor proporcionado.
     public Pedido(String nombrePlato) 
     {
         this.nombrePlato = nombrePlato;
     }
    // Método para obtener el nombre del plato del pedido.
    // Devuelve el valor del atributo nombrePlato.
     public String getNombrePlato() 
     {
         return nombrePlato;
     }
}