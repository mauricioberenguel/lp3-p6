package ClasePrincipal;

import Controlador.PedidoControlador;
import Modelo.PedidoModelo;
import Vista.PedidoVista;

public class Main 
{
    public static void main(String[] args) 
    {
        // Crear las instancias del modelo, la vista y el controlador
        PedidoModelo modelo = new PedidoModelo();
        PedidoVista vista = new PedidoVista();
        PedidoControlador controlador = new PedidoControlador(modelo, vista);
        // Iniciar la aplicación
        controlador.iniciar();
    }
}