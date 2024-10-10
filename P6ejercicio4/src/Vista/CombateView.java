package Vista;

import Modelo.Enemigo;
import Modelo.Jugador;

public class CombateView 
{
    // Método para mostrar el estado del jugador.
    // Recibe un objeto Jugador como argumento y muestra su nombre y salud en la consola.
    public void mostrarEstadoJugador(Jugador jugador) 
    {
        System.out.println("Jugador: " + jugador.getNombre() + " | Salud: " + jugador.getSalud());
    }
    // Método para mostrar el estado del enemigo.
    // Recibe un objeto Enemigo como argumento y muestra su nombre y salud en la consola.
    public void mostrarEstadoEnemigo(Enemigo enemigo) 
    {
        System.out.println("Enemigo: " + enemigo.getNombre() + " | Salud: " + enemigo.getSalud());
    }
    // Método para mostrar un mensaje al usuario.
    // Recibe un mensaje como argumento y lo imprime en la consola.
    public void mostrarMensaje(String mensaje) 
    {
        System.out.println(mensaje);
    }
    // Método para mostrar el resultado del combate.
    // Recibe dos booleanos como argumentos, indicando si el jugador y el enemigo están vivos.
    // Muestra un mensaje en la consola indicando el resultado del combate.
    public void mostrarResultadoCombate(boolean jugadorVivo, boolean enemigoVivo) 
    {
        // Si ambos combatientes están muertos, se muestra un mensaje de empate.
        if (!jugadorVivo && !enemigoVivo) 
        {
            System.out.println("¡Es un empate! Ambos combatientes han caído.");
        } 
        // Si el jugador está muerto, se muestra un mensaje de derrota del jugador.
        else if (!jugadorVivo) 
        {
            System.out.println("El jugador ha sido derrotado.");
        } 
        // Si el enemigo está muerto, se muestra un mensaje de victoria del jugador.
        else if (!enemigoVivo) 
        {
            System.out.println("El enemigo ha sido derrotado.");
        }
    }
}