package Modelo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioModelo 
{
    // Atributo privado que almacena una lista de usuarios registrados.
    private List<Usuario> usuarios;
    // Atributo privado que almacena el usuario autenticado actualmente.
    private Usuario usuarioAutenticado;

    // Constructor que inicializa la lista de usuarios.
    public UsuarioModelo() 
    {
        this.usuarios = new ArrayList<>();
    }

    // Método para registrar un nuevo usuario.
    public boolean registrarUsuario(String nombre, String email, String password) 
    {
        // Verificar si el email ya está registrado
        for (Usuario usuario : usuarios) 
        {
            // Si el email ya existe, devolver false (email ya registrado)
            if (usuario.getEmail().equalsIgnoreCase(email))  // Comparación ignorando mayúsculas/minúsculas
            {
                return false; 
            }
        }
        // Si el email no está registrado, agregar un nuevo usuario a la lista.
        usuarios.add(new Usuario(nombre, email, password));
        return true;  // Registro exitoso
    }

    // Método para iniciar sesión.
    public boolean iniciarSesion(String email, String password) 
    {
        for (Usuario usuario : usuarios) 
        {
            // Comparar el email ignorando mayúsculas/minúsculas y validar la contraseña exacta
            if (usuario.getEmail().equalsIgnoreCase(email)) 
            {
                if (usuario.getPassword().equals(password))  // Comparación exacta de la contraseña
                {
                    usuarioAutenticado = usuario;  // Autenticar al usuario
                    return true;  // Sesión iniciada exitosamente
                }
            }
        }
        return false;  // Si el email o la contraseña no coinciden, devolver false
    }

    // Método para obtener el usuario autenticado actualmente.
    public Usuario obtenerUsuarioAutenticado() 
    {
        return usuarioAutenticado;
    }

    // Método para cerrar sesión.
    public void cerrarSesion() 
    {
        usuarioAutenticado = null;
    }
}