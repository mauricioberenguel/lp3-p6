package Modelo;

public class Pedido 
{
    // Atributo privado que almacena el nombre del plato.
    private String nombrePlato;
    // Atributo privado que almacena el tipo de plato.
    private String tipoPlato;
    // Atributo privado que almacena el estado del pedido.
    // Puede ser "pendiente", "completo" o "eliminado".
    private String estado;  
    // Constructor de la clase Pedido.
    // Inicializa el nombre del plato, el tipo de plato y el estado del pedido.
    // El estado por defecto es "pendiente".
    public Pedido(String nombrePlato, String tipoPlato) 
    {
        this.nombrePlato = nombrePlato;
        this.tipoPlato = tipoPlato;
        this.estado = "pendiente";  
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
    // Método para obtener el estado del pedido.
    // Devuelve el valor del atributo estado.
    public String getEstado() 
    {
        return estado;
    }
    // Método para establecer el estado del pedido.
    // Recibe un String como argumento y lo asigna al atributo estado.
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    // Método para verificar si el pedido está completo.
    // Devuelve true si el estado es "completo", false en caso contrario.
    public boolean isCompleto() 
    {
        return estado.equals("completo");
    }
    // Método para verificar si el pedido está pendiente.
    // Devuelve true si el estado es "pendiente", false en caso contrario.
    public boolean isPendiente() 
    {
        return estado.equals("pendiente");
    }
    // Método para verificar si el pedido está eliminado.
    // Devuelve true si el estado es "eliminado", false en caso contrario.
    public boolean isEliminado() 
    {
        return estado.equals("eliminado");
    }
}