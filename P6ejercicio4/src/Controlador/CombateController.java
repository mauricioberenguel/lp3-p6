package Controlador;

import java.util.Scanner;
import Modelo.Enemigo;
import Modelo.Jugador;
import Vista.CombateView;

public class CombateController 
{
    private Jugador jugador;
    private Enemigo enemigo;
    private CombateView vista;
    public CombateController(Jugador jugador, Enemigo enemigo, CombateView vista) 
    {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.vista = vista;
    }
    public void iniciarCombate() 
    {
        Scanner scanner = new Scanner(System.in);
        while (jugador.estaVivo() && enemigo.estaVivo()) 
        {
            vista.mostrarEstadoJugador(jugador);
            vista.mostrarEstadoEnemigo(enemigo);
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Usar Item");
            int opcion = scanner.nextInt();
            switch (opcion) 
            {
                case 1:
                    jugador.atacar(enemigo);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del item a usar:");
                    scanner.nextLine(); // Consumir nueva línea
                    String nombreItem = scanner.nextLine();
                    jugador.usarItem(nombreItem);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            // Ataque del enemigo
            if (enemigo.estaVivo()) 
            {
                enemigo.atacar(jugador);
            }
            vista.mostrarMensaje("--------------------------------");
        }
        vista.mostrarResultadoCombate(jugador.estaVivo(), enemigo.estaVivo());
    }
}