package Controlador;

import Modelo.UsuarioModelo;
import Vista.UsuarioVista;
import Modelo.Producto;

public class UsuarioControlador 
{
    private UsuarioModelo modelo;
    private UsuarioVista vista;
    private CarritoControlador carritoControlador;
    private ReseñaControlador reseñaControlador;

    // Constructor que recibe el modelo, la vista, y los controladores adicionales (carrito y reseñas).
    public UsuarioControlador(UsuarioModelo modelo, UsuarioVista vista, CarritoControlador carritoControlador, ReseñaControlador reseñaControlador) 
    {
        this.modelo = modelo;
        this.vista = vista;
        this.carritoControlador = carritoControlador;
        this.reseñaControlador = reseñaControlador;
    }

    // Método principal para iniciar el flujo de autenticación y control del sistema.
    public void iniciar() 
    {
        boolean salir = false;
        while (!salir) 
        {
            // Mostrar el menú de autenticación.
            vista.mostrarMenuAutenticacion();
            String opcion = vista.solicitarOpcion();  // Solicitar la opción del usuario.

            switch (opcion) 
            {
                case "1":
                    registrarUsuario();  // Registrar un nuevo usuario.
                    break;
                case "2":
                    if (iniciarSesion())  // Iniciar sesión y si es exitoso, mostrar el menú principal.
                    {
                        // Una vez que el usuario inicie sesión, mostrar el menú principal del sistema.
                        mostrarMenuPrincipal();
                    }
                    break;
                case "3":
                    salir = true;  // Salir del bucle principal.
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        }
    }

    // Método privado para registrar un nuevo usuario.
    private void registrarUsuario() 
    {
        String nombre = vista.solicitarNombre();
        String email = vista.solicitarEmail();
        String password = vista.solicitarPassword();

        if (modelo.registrarUsuario(nombre, email, password)) 
        {
            vista.mostrarMensaje("Usuario registrado con éxito.");
        } 
        else 
        {
            vista.mostrarMensaje("Error: Email ya registrado.");
        }
    }

    // Método privado para iniciar sesión.
    private boolean iniciarSesion() 
    {
        String email = vista.solicitarEmail();
        String password = vista.solicitarPassword();

        if (modelo.iniciarSesion(email, password)) 
        {
            vista.mostrarMensaje("Sesión iniciada con éxito.");
            return true;
        } 
        else 
        {
            vista.mostrarMensaje("Error: Credenciales incorrectas.");
            return false;
        }
    }

    // Nuevo método para mostrar el menú principal después de iniciar sesión.
    private void mostrarMenuPrincipal() 
    {
        boolean salir = false;
        while (!salir) 
        {
            // Mostrar el menú de opciones después de iniciar sesión.
            vista.mostrarMenuPrincipal();
            String opcion = vista.solicitarOpcion();  // Solicitar la opción del usuario.

            switch (opcion) 
            {
                case "1":
                    // Invocar el controlador del carrito para gestionar el carrito.
                    carritoControlador.iniciar();
                    break;
                case "2":
                    // Invocar el controlador de reseñas para agregar o ver reseñas.
                    agregarReseñaProducto();
                    break;
                case "3":
                    salir = true;  // Salir del menú principal y cerrar sesión.
                    modelo.cerrarSesion();
                    vista.mostrarMensaje("Sesión cerrada.");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        }
    }

    // Método privado para agregar una reseña a un producto después de iniciar sesión.
    private void agregarReseñaProducto() 
    {
        Producto producto = new Producto("Producto Ejemplo", 100.0);  // Producto de ejemplo.
        reseñaControlador.agregarReseña(producto);  // Llamar al controlador de reseñas para agregar la reseña.
        reseñaControlador.mostrarReseñas(producto);  // Mostrar las reseñas del producto.
    }
}
