package ClasePrincipal;

import Controlador.CombateController;
import Modelo.Enemigo;
import Modelo.Item;
import Modelo.Jugador;
import Vista.CombateView;

public class Main 
{

    public static void main(String[] args) 
    {
        // Crear el jugador y el enemigo
        // Se crea un nuevo jugador con el nombre "Programador Supremo" y nivel 1.
        Jugador jugador = new Jugador("Programador Supremo", 1);
        // Se crea un nuevo enemigo con el nombre "Lizzie Turpo", nivel 1 y tipo "QA".
        Enemigo enemigo = new Enemigo("Lizzie Turpo", 1, "QA");
        // Crear el inventario y equipar un arma
        // Se crea un nuevo item llamado "Espada" con cantidad 1, tipo "Arma" y una descripción.
        Item espada = new Item("Espada", 3, "Arma", "Una espada afilada y resistente");
        // Se equipa la espada al jugador utilizando el método equiparItem().
        jugador.equiparItem(espada);
        // Se agrega la espada al inventario del jugador utilizando el método agregarItem().
        jugador.getInventario().agregarItem(espada);
        // Crear la vista y el controlador de combate
        // Se crea una nueva vista de combate.
        CombateView vista = new CombateView();
        // Se crea un nuevo controlador de combate, pasándole como argumentos el jugador, el enemigo y la vista.
        CombateController combateController = new CombateController(jugador, enemigo, vista);
        // Iniciar el combate
        // Se inicia el combate utilizando el método iniciarCombate() del controlador.
        combateController.iniciarCombate();
    }
}