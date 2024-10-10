package Modelo;

public class Usuario 
{
    private String nombre;
    private String email;
    private String password;
    
    // Constructor que inicializa el nombre, email y contraseña.
    public Usuario(String nombre, String email, String password) 
    {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // Métodos getters para obtener los atributos del usuario.
    public String getNombre() 
    {
        return nombre;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getPassword() 
    {
        return password;  // Devuelve la contraseña para comparar en el inicio de sesión
    }
}
