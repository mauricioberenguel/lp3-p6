package Modelo;

import java.util.Random;

public class Enemigo 
{
    // Atributo privado que almacena el nombre del enemigo.
    private String nombre;
    // Atributo privado que almacena la salud del enemigo.
    private int salud;
    // Atributo privado que almacena el nivel del enemigo.
    private int nivel;
    // Atributo privado que almacena el tipo del enemigo.
    private String tipo;
    // Constructor de la clase Enemigo.
    // Inicializa el nombre, nivel y tipo del enemigo con los valores proporcionados.
    // La salud inicial se establece en 100.
    public Enemigo(String nombre, int nivel, String tipo) 
    {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = 100; // Salud inicial
        this.tipo = tipo;
    }
    // Método para obtener el nombre del enemigo.
    // Devuelve el valor del atributo nombre.
    public String getNombre() 
    {
        return nombre;
    }
    // Método para obtener la salud del enemigo.
    // Devuelve el valor del atributo salud.
    public int getSalud() 
    {
        return salud;
    }
    // Método para aplicar daño al enemigo.
    // Recibe la cantidad de daño como argumento y la resta de la salud del enemigo.
    // Si la salud del enemigo se vuelve negativa, se establece en 0.
    public void recibirDanio(int cantidad) 
    {
        salud -= cantidad;
        if (salud < 0) 
        {
            salud = 0;
        }
    }
    // Método para que el enemigo ataque al jugador.
    // Recibe un objeto Jugador como argumento.
    // Genera un daño aleatorio entre 5 y 20 y lo aplica al jugador utilizando el método recibirDanio().
    // Muestra un mensaje en la consola indicando que el enemigo ha atacado y el daño causado.
    public void atacar(Jugador jugador) 
    {
        Random random = new Random();
        int danio = random.nextInt(15) + 5; // Daño entre 5 y 20
        jugador.recibirDanio(danio);
        System.out.println(nombre + " (" + tipo + ") ataca y causa " + danio + " de daño.");
    }
    // Método para verificar si el enemigo está vivo.
    // Devuelve true si la salud del enemigo es mayor que 0, false en caso contrario.
    public boolean estaVivo() 
    {
        return salud > 0;
    }
}