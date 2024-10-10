package Vista;

import java.util.Scanner;

public class UsuarioVista 
{
    private Scanner scanner;

    public UsuarioVista() 
    {
        scanner = new Scanner(System.in);
    }

    public String solicitarEmail() 
    {
        System.out.print("Introduce tu email: ");
        return scanner.nextLine();
    }

    public String solicitarPassword() 
    {
        System.out.print("Introduce tu contraseña: ");
        return scanner.nextLine();
    }

    public String solicitarNombre() 
    {
        System.out.print("Introduce tu nombre: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) 
    {
        System.out.println(mensaje);
    }

    // Menú de autenticación (inicial).
    public void mostrarMenuAutenticacion() 
    {
        System.out.println("\n1. Registrar usuario");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Salir");
    }

    // Nuevo menú principal que se muestra después de iniciar sesión.
    public void mostrarMenuPrincipal() 
    {
        System.out.println("\n1. Gestionar Carrito");
        System.out.println("2. Agregar Reseña");
        System.out.println("3. Cerrar Sesión");
    }

    // Método para solicitar la opción del usuario.
    public String solicitarOpcion() 
    {
        System.out.print("Selecciona una opción: ");
        return scanner.nextLine();
    }
}
