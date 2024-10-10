package ClasePrincipal;

import Controlador.CarritoControlador;
import Modelo.CarritoModelo;
import Vista.CarritoVista;

public class Main 
{
    // Método principal de la aplicación.
    public static void main(String[] args) 
    {
        // Instanciar el modelo y la vista para el carrito de compras.
        CarritoModelo modelo = new CarritoModelo();
        CarritoVista vista = new CarritoVista();
        // Crear el controlador del carrito de compras.
        CarritoControlador controlador = new CarritoControlador(modelo, vista);
        // Iniciar la ejecución de la aplicación.
        controlador.iniciar();
    }
}