package Taller15.Ejercicio3.B;

public class ServicioAutenticacion { 

    public boolean autenticar(Usuario usuario, String nombreUsuario, String contraseña) {  
        return usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña);
    }
}

