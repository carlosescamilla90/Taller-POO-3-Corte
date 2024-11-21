package Taller15.Ejercicio3.B;

public class ServicioValidacion { 

    public boolean validarContraseña(Usuario usuario) { 
        String contraseña = usuario.getContraseña();
        return contraseña.length() >= 6 && contraseña.matches(".*\\d.*") && contraseña.matches(".*[a-zA-Z].*");
    }
}

