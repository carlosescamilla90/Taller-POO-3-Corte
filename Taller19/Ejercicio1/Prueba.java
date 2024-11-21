package Taller19.Ejercicio1;

public class Prueba { 
    public static void main(String[] args) { 
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal(); 
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth(); 

        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal); 
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth); 

        System.out.println("Autenticación Local: " + gestorLocal.autenticarUsuario("usuarioLocal", "contraseñaLocal")); // Prueba de autenticación local
        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticarUsuario("usuarioOAuth", "contraseñaOAuth")); // Prueba de autenticación OAuth
    }
}

