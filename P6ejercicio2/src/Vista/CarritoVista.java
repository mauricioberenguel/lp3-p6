package Vista;

import java.util.List;
import java.util.Scanner;
import Modelo.Producto;

public class CarritoVista 
{
    private Scanner scanner;

    public CarritoVista() 
    {
        scanner = new Scanner(System.in);
    }

    public String solicitarNombreProducto() 
    {
        System.out.print("Introduce el nombre del producto: ");
        return scanner.nextLine();
    }

    public double solicitarPrecioProducto() 
    {
        double precio = 0.0;
        boolean entradaValida = false;
        while (!entradaValida) 
        {
            System.out.print("Introduce el precio del producto: ");
            try 
            {
                precio = scanner.nextDouble();
                scanner.nextLine();
                entradaValida = true;
            } 
            catch (Exception e) 
            {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.nextLine();
            }
        }
        return precio;
    }

    public void mostrarProductos(List<Producto> productos) 
    {
        if (productos.isEmpty()) 
        {
            System.out.println("No hay productos.");
        } 
        else 
        {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) 
            {
                System.out.println("- " + producto);
            }
        }
    }

    public void mostrarTotal(double total) 
    {
        System.out.println("Total: S/." + total);
    }

    public double solicitarDescuento() 
    {
        double descuento = 0.0;
        boolean entradaValida = false;
        while (!entradaValida) 
        {
            System.out.print("Introduce el porcentaje de descuento: ");
            try 
            {
                descuento = scanner.nextDouble();
                scanner.nextLine();
                entradaValida = true;
            } 
            catch (Exception e) 
            {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.nextLine();
            }
        }
        return descuento;
    }

    public void mostrarMensaje(String mensaje) 
    {
        System.out.println(mensaje);
    }

    public void mostrarHistorialCompras(List<Producto> historial) 
    {
        if (historial.isEmpty()) 
        {
            System.out.println("No hay compras realizadas.");
        } 
        else 
        {
            System.out.println("Historial de compras:");
            for (Producto producto : historial) 
            {
                System.out.println("- " + producto);
            }
        }
    }

    public void mostrarMenu() 
    {
        System.out.println("\nOpciones:");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Ver Carrito");
        System.out.println("3. Eliminar Producto del Carrito");
        System.out.println("4. Aplicar Descuento");
        System.out.println("5. Calcular Envío");
        System.out.println("6. Realizar Compra");
        System.out.println("7. Ver Historial de Compras");
        System.out.println("8. Salir");
    }

    public String solicitarOpcion() 
    {
        System.out.print("Selecciona una opción: ");
        return scanner.nextLine();
    }
}
