package ClasePrincipal;

import java.util.Scanner;
import Controlador.InventarioController;
import Modelo.InventarioModel;
import Vista.InventarioView;

public class Main 
{
    public static void main(String[] args) 
    {
        // Crear el modelo, la vista y el controlador para el inventario.
        InventarioModel modelo = new InventarioModel();
        InventarioView vista = new InventarioView();
        InventarioController controlador = new InventarioController(modelo, vista);
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);
        // Variable booleana para controlar la salida del bucle principal.
        boolean salir = false;
        // Bucle principal del programa.
        while (!salir) 
        {
            // Mostrar el menú de opciones al usuario.
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Ver Inventario");
            System.out.println("2. Agregar Item");
            System.out.println("3. Eliminar Item");
            System.out.println("4. Buscar Item");
            System.out.println("5. Mostrar Detalles de un Item");
            System.out.println("6. Salir");
            // Solicitar al usuario que elija una opción.
            System.out.print("Elige una opción: ");
            // Leer la opción del usuario.
            int opcion = scanner.nextInt();
            // Consumir la nueva línea del buffer de entrada.
            scanner.nextLine();  // Consumir la nueva línea
            // Procesar la opción seleccionada por el usuario.
            switch (opcion) 
            {
                // Opción 1: Ver el inventario.
                case 1:
                    // Llama al método verInventario() del controlador para mostrar el inventario.
                    controlador.verInventario();
                    break;
                // Opción 2: Agregar un nuevo item al inventario.
                case 2:
                    // Solicitar al usuario los datos del nuevo item.
                    System.out.print("Nombre del item: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                    System.out.print("Tipo (Arma, Poción): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    // Llama al método agregarItem() del controlador para agregar el nuevo item.
                    controlador.agregarItem(nombre, cantidad, tipo, descripcion);
                    break;
                // Opción 3: Eliminar un item del inventario.
                case 3:
                    // Solicitar al usuario el nombre del item a eliminar.
                    System.out.print("Nombre del item a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    // Llama al método eliminarItem() del controlador para eliminar el item.
                    controlador.eliminarItem(nombreEliminar);
                    break;
                // Opción 4: Buscar un item en el inventario.
                case 4:
                    // Solicitar al usuario el nombre del item a buscar.
                    System.out.print("Nombre del item a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    // Llama al método buscarItem() del controlador para buscar el item.
                    controlador.buscarItem(nombreBuscar);
                    break;
                // Opción 5: Mostrar los detalles de un item.
                case 5:
                    // Solicitar al usuario el nombre del item para mostrar detalles.
                    System.out.print("Nombre del item para mostrar detalles: ");
                    String nombreDetalles = scanner.nextLine();
                    // Llama al método mostrarDetalles() del controlador para mostrar los detalles del item.
                    controlador.mostrarDetalles(nombreDetalles);
                    break;
                // Opción 6: Salir del programa.
                case 6:
                    // Establecer la variable salir en true para salir del bucle principal.
                    salir = true;
                    System.out.println("Saliendo del sistema de inventario...");
                    break;
                // Opción inválida.
                default:
                    System.out.println("Opción no válida.");
            }
        }
        // Cerrar el objeto Scanner para liberar recursos.
        scanner.close();
    }
}
