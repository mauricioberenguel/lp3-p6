package ClasePrincipal;

import Controlador.PedidoControlador;
import Modelo.PedidoModelo;
import Vista.PedidoVista;

public class Main 
{
    // Método principal de la aplicación.
    public static void main(String[] args) 
    {
        // Crea un objeto PedidoModelo para gestionar los pedidos.
        PedidoModelo modelo = new PedidoModelo();
        // Crea un objeto PedidoVista para interactuar con el usuario.
        PedidoVista vista = new PedidoVista();
        // Crea un objeto PedidoControlador para manejar la lógica de la aplicación.
        // Pasa el objeto modelo y el objeto vista al controlador.
        PedidoControlador controlador = new PedidoControlador(modelo, vista);
        // Inicia la ejecución del controlador.
        controlador.iniciar();
    }
}