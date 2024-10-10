package Modelo;

import java.util.Random;

public class Jugador 
{
    // Atributo privado que almacena el nombre del jugador.
    private String nombre;
    // Atributo privado que almacena la salud del jugador.
    private int salud;
    // Atributo privado que almacena el nivel del jugador.
    private int nivel;
    // Atributo privado que almacena el item equipado por el jugador.
    private Item itemEquipado;
    // Atributo privado que almacena el inventario del jugador.
    private InventarioModel inventario;
    // Constructor de la clase Jugador.
    // Inicializa el nombre, nivel y salud del jugador con los valores proporcionados.
    // Se crea un nuevo inventario para el jugador.
    public Jugador(String nombre, int nivel) 
    {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = 100; // Salud inicial
        this.inventario = new InventarioModel();
    }
    // Método para obtener el nombre del jugador.
    // Devuelve el valor del atributo nombre.
    public String getNombre() 
    {
        return nombre;
    }
    // Método para obtener la salud del jugador.
    // Devuelve el valor del atributo salud.
    public int getSalud() 
    {
        return salud;
    }
    // Método para aplicar daño al jugador.
    // Recibe la cantidad de daño como argumento y la resta de la salud del jugador.
    // Si la salud del jugador se vuelve negativa, se establece en 0.
    public void recibirDanio(int cantidad) 
    {
        salud -= cantidad;
        if (salud < 0) 
        {
            salud = 0;
        }
    }
    // Método para usar un item del inventario.
    // Recibe el nombre del item como argumento.
    // Busca el item en el inventario y si lo encuentra, lo usa utilizando el método usarItem() del item.
    // Si no encuentra el item, muestra un mensaje indicando que no está en el inventario.
    public void usarItem(String nombreItem) 
    {
        Item item = inventario.buscarItem(nombreItem);
        if (item != null) 
        {
            item.usarItem();
        } 
        else 
        {
            System.out.println("No tienes ese item en tu inventario.");
        }
    }
    // Método para equipar un item.
    // Recibe un objeto Item como argumento.
    // Establece el item como el item equipado y muestra un mensaje indicando que el item se ha equipado.
    public void equiparItem(Item item) 
    {
        this.itemEquipado = item;
        System.out.println(nombre + " ha equipado: " + item.getNombre());
    }
    // Método para que el jugador ataque al enemigo.
    // Recibe un objeto Enemigo como argumento.
    // Si el jugador tiene un item equipado, genera un daño aleatorio entre 10 y 30 y lo aplica al enemigo utilizando el método recibirDanio().
    // Si no tiene un item equipado, muestra un mensaje indicando que no tiene un arma equipada.
    public void atacar(Enemigo enemigo) 
    {
        if (itemEquipado == null) 
        {
            System.out.println(nombre + " no tiene un arma equipada.");
        } 
        else 
        {
            Random random = new Random();
            int danio = random.nextInt(20) + 10; // Daño entre 10 y 30
            enemigo.recibirDanio(danio);
            System.out.println(nombre + " ataca con " + itemEquipado.getNombre() + " y causa " + danio + " de daño.");
        }
    }
    // Método para verificar si el jugador está vivo.
    // Devuelve true si la salud del jugador es mayor que 0, false en caso contrario.
    public boolean estaVivo() 
    {
        return salud > 0;
    }
    // Método para obtener el inventario del jugador.
    // Devuelve el objeto InventarioModel que representa el inventario del jugador.
    public InventarioModel getInventario() 
    {
        return this.inventario;
    }
}
