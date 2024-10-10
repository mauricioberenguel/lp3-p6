package Vista;

import java.util.List;
import java.util.Scanner;
import Modelo.Reseña;

public class ReseñaVista 
{
    // Atributo privado que almacena un objeto Scanner para leer la entrada del usuario.
    private Scanner scanner;
    // Constructor de la clase ReseñaVista.
    // Inicializa el objeto Scanner para leer la entrada del usuario desde System.in.
    public ReseñaVista() 
    {
        scanner = new Scanner(System.in);
    }
    // Método para solicitar el comentario al usuario.
    // Imprime un mensaje solicitando el comentario y devuelve la entrada del usuario.
    public String solicitarComentario() 
    {
        System.out.print("Escribe tu comentario: ");
        return scanner.nextLine();
    }
    // Método para solicitar la calificación al usuario.
    // Imprime un mensaje solicitando la calificación y devuelve la entrada del usuario.
    public int solicitarCalificacion() 
    {
        System.out.print("Introduce tu calificación (1-5): ");
        return scanner.nextInt();
    }
    // Método para mostrar las reseñas de un producto.
    // Recibe una lista de objetos Reseña como argumento y la muestra en la consola.
    public void mostrarReseñas(List<Reseña> reseñas) 
    {
        if (reseñas.isEmpty()) 
        {
            System.out.println("No hay reseñas para este producto.");
        } 
        else 
        {
            for (Reseña reseña : reseñas) 
            {
                System.out.println(reseña);
            }
        }
    }
    // Método para mostrar un mensaje al usuario.
    // Recibe un mensaje como argumento y lo imprime en la consola.
    public void mostrarMensaje(String mensaje) 
    {
        System.out.println(mensaje);
    }
}