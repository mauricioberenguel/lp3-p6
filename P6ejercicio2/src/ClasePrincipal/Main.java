package ClasePrincipal;

import Controlador.CarritoControlador;
import Controlador.ReseñaControlador;
import Controlador.UsuarioControlador;
import Modelo.CarritoModelo;
import Modelo.UsuarioModelo;
import Vista.CarritoVista;
import Vista.ReseñaVista;
import Vista.UsuarioVista;

public class Main 
{
    public static void main(String[] args) 
    {
        // Inicializar los componentes del sistema.
        CarritoModelo carritoModelo = new CarritoModelo();
        CarritoVista carritoVista = new CarritoVista();
        CarritoControlador carritoControlador = new CarritoControlador(carritoModelo, carritoVista);
        UsuarioModelo usuarioModelo = new UsuarioModelo();
        UsuarioVista usuarioVista = new UsuarioVista();
        ReseñaVista reseñaVista = new ReseñaVista();
        ReseñaControlador reseñaControlador = new ReseñaControlador(reseñaVista, usuarioModelo);
        // Inicializar el controlador principal del sistema (autenticación y gestión).
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioModelo, usuarioVista, carritoControlador, reseñaControlador);
        // Iniciar el sistema.
        usuarioControlador.iniciar();
    }
}