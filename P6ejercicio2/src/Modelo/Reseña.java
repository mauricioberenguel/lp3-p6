package Modelo;

public class Reseña 
{
    // Atributo privado que almacena el comentario de la reseña.
    private String comentario;
    // Atributo privado que almacena la calificación de la reseña (de 1 a 5).
    private int calificacion; // Rango de 1 a 5
    // Atributo privado que almacena el nombre del usuario que escribió la reseña.
    private String usuario;
    // Constructor de la clase Reseña.
    // Inicializa el comentario, la calificación y el usuario de la reseña con los valores proporcionados.
    public Reseña(String comentario, int calificacion, String usuario) 
    {
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.usuario = usuario;
    }
    // Método para obtener el comentario de la reseña.
    // Devuelve el valor del atributo comentario.
    public String getComentario() 
    {
        return comentario;
    }
    // Método para obtener la calificación de la reseña.
    // Devuelve el valor del atributo calificacion.
    public int getCalificacion() 
    {
        return calificacion;
    }
    // Método para obtener el nombre del usuario que escribió la reseña.
    // Devuelve el valor del atributo usuario.
    public String getUsuario() 
    {
        return usuario;
    }
    // Sobrescribe el método toString() de la clase Object.
    // Devuelve una representación en cadena del objeto Reseña en formato:
    // "Usuario: usuario\nCalificación: calificacion\nComentario: comentario"
    @Override
    public String toString() 
    {
        return "Usuario: " + usuario + "\nCalificación: " + calificacion + "\nComentario: " + comentario;
    }
}
