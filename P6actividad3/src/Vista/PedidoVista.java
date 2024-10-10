package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Pedido;

public class PedidoVista 
{
    // Atributo privado que almacena un objeto Scanner para leer la entrada del usuario.
    private Scanner scanner;
    // Constructor de la clase PedidoVista.
    // Inicializa el objeto Scanner para leer la entrada del usuario desde System.in.
    public PedidoVista() 
    {
        scanner = new Scanner(System.in);
    }
    // Método para solicitar el nombre del plato al usuario.
    // Imprime un mensaje solicitando el nombre del plato y devuelve la entrada del usuario.
    public String solicitarNombrePlato() 
    {
        System.out.print("Introduce el nombre del plato: ");
        return scanner.nextLine();
    }
    // Método para solicitar el tipo de plato al usuario.
    // Imprime un mensaje solicitando el tipo de plato y devuelve la entrada del usuario.
    public String solicitarTipoPlato() 
    {
        System.out.print("Introduce el tipo de plato: ");
        return scanner.nextLine();
    }
    // Método para solicitar el nombre del pedido a actualizar, eliminar o completar.
    // Imprime un mensaje solicitando el nombre del pedido y devuelve la entrada del usuario.
    public String solicitarNombreActual() 
    {
        System.out.print("Introduce el nombre del pedido a actualizar/eliminar/completar: ");
        return scanner.nextLine();
    }
    // Método para mostrar la lista de pedidos.
    // Recibe una lista de objetos Pedido como argumento y la muestra en la consola.
    public void mostrarPedidos(List<Pedido> pedidos) 
    {
        if (pedidos.isEmpty()) 
        {
            System.out.println("No hay pedidos en la lista.");
        } 
        else 
        {
            System.out.println("Lista de Pedidos:");
            for (Pedido pedido : pedidos) 
            {
                System.out.println("- " + pedido.getNombrePlato() + " (Tipo: " + pedido.getTipoPlato() + ", Estado: " + pedido.getEstado() + ")");
            }
        }
    }
    // Método para mostrar el historial de pedidos completados o eliminados.
    // Recibe una lista de objetos Pedido como argumento y la muestra en la consola.
    public void mostrarHistorial(List<Pedido> historial) 
    {
        if (historial.isEmpty()) 
        {
            System.out.println("El historial está vacío.");
        } 
        else 
        {
            System.out.println("Historial de Pedidos Completados o Eliminados:");
            for (Pedido pedido : historial) 
            {
                System.out.println("- " + pedido.getNombrePlato() + " (Tipo: " + pedido.getTipoPlato() + ", Estado: " + pedido.getEstado() + ")");
            }
        }
    }
    // Método para mostrar el menú de opciones al usuario.
    // Imprime las opciones disponibles en la consola.
    public void mostrarMenu() 
    {
        System.out.println("\nOpciones:");
        System.out.println("1. Agregar Pedido");
        System.out.println("2. Mostrar Pedidos");
        System.out.println("3. Eliminar Pedido");
        System.out.println("4. Actualizar Pedido");
        System.out.println("5. Buscar Pedido por Nombre");
        System.out.println("6. Buscar Pedido por Tipo");
        System.out.println("7. Marcar Pedido como Completo");
        System.out.println("8. Mostrar Pedidos por Estado");
        System.out.println("9. Contar Pedidos Pendientes");
        System.out.println("10. Mostrar Historial de Pedidos");
        System.out.println("11. Salir");
    }
    // Método para solicitar la opción al usuario.
    // Imprime un mensaje solicitando la opción y devuelve la entrada del usuario.
    public String solicitarOpcion() 
    {
        System.out.print("Selecciona una opción: ");
        return scanner.nextLine();
    }
    // Método para solicitar el estado del pedido al usuario.
    // Imprime un mensaje solicitando el estado y devuelve la entrada del usuario.
    public String solicitarEstado() 
    {
        System.out.print("Introduce el estado (pendiente/completo/eliminado): ");
        return scanner.nextLine();
    }
    // Método para mostrar un mensaje al usuario.
    // Recibe un mensaje como argumento y lo imprime en la consola.
    public void mostrarMensaje(String mensaje) 
    {
        System.out.println(mensaje);
    }
    // Método para cerrar el objeto Scanner.
    // Cierra el objeto Scanner para liberar recursos.
    public void cerrarScanner() 
    {
        scanner.close();
    }
}