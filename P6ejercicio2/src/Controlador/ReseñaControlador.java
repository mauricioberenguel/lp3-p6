package Controlador;

import Modelo.Producto;
import Modelo.Reseña;
import Modelo.UsuarioModelo;
import Vista.ReseñaVista;

public class ReseñaControlador 
{
    // Atributo privado que almacena la vista de las reseñas.
    private ReseñaVista vista;
    // Atributo privado que almacena el modelo de usuarios.
    private UsuarioModelo usuarioModelo;
    // Constructor de la clase ReseñaControlador.
    // Recibe la vista y el modelo de usuarios como parámetros.
    public ReseñaControlador(ReseñaVista vista, UsuarioModelo usuarioModelo) 
    {
        this.vista = vista;
        this.usuarioModelo = usuarioModelo;
    }
    // Método para agregar una reseña a un producto.
    // Recibe un objeto Producto como argumento.
    public void agregarReseña(Producto producto) 
    {
        // Verifica si hay un usuario autenticado.
        if (usuarioModelo.obtenerUsuarioAutenticado() != null) 
        {
            // Solicita el comentario y la calificación al usuario.
            String comentario = vista.solicitarComentario();
            int calificacion = vista.solicitarCalificacion();
            // Obtiene el nombre del usuario autenticado.
            String usuario = usuarioModelo.obtenerUsuarioAutenticado().getNombre();

            // Crea un nuevo objeto Reseña.
            Reseña reseña = new Reseña(comentario, calificacion, usuario);
            // Agrega la reseña al producto.
            producto.agregarReseña(reseña);
            // Muestra un mensaje de éxito al usuario.
            vista.mostrarMensaje("Reseña agregada con éxito.");
        } 
        else 
        {
            // Muestra un mensaje de error al usuario.
            vista.mostrarMensaje("Debes iniciar sesión para dejar una reseña.");
        }
    }
    // Método para mostrar las reseñas de un producto.
    // Recibe un objeto Producto como argumento.
    public void mostrarReseñas(Producto producto) 
    {
        // Muestra las reseñas del producto a través de la vista.
        vista.mostrarReseñas(producto.getReseñas());
    }
}
