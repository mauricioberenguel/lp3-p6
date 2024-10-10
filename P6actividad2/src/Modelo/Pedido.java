package Modelo;

public class Pedido 
{
    // Atributo privado que almacena el nombre del plato.
    private String nombrePlato;
    // Atributo privado que almacena el tipo de plato.
    private String tipoPlato;
    // Constructor de la clase Pedido.
    // Inicializa los atributos nombrePlato y tipoPlato con los valores proporcionados.
    public Pedido(String nombrePlato, String tipoPlato) 
    {
        this.nombrePlato = nombrePlato;
        this.tipoPlato = tipoPlato;
    }
    // Método para obtener el nombre del plato.
    // Devuelve el valor del atributo nombrePlato.
    public String getNombrePlato() 
    {
        return nombrePlato;
    }
    // Método para establecer el nombre del plato.
    // Recibe un String como argumento y lo asigna al atributo nombrePlato.
    public void setNombrePlato(String nombrePlato) 
    {
        this.nombrePlato = nombrePlato;
    }
    // Método para obtener el tipo de plato.
    // Devuelve el valor del atributo tipoPlato.
    public String getTipoPlato() 
    {
        return tipoPlato;
    }
    // Método para establecer el tipo de plato.
    // Recibe un String como argumento y lo asigna al atributo tipoPlato.
    public void setTipoPlato(String tipoPlato) 
    {
        this.tipoPlato = tipoPlato;
    }
}