package Taller15.Ejercicio3.B;

public class Prueba { 
    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario1", "contrasena");  
        ServicioAutenticacion servicioAutenticacion = new ServicioAutenticacion(); 
        ServicioValidacion servicioValidacion = new ServicioValidacion(); 

        boolean esAutenticado = servicioAutenticacion.autenticar(usuario, "usuario1", "contrasena"); // Autentica el usuario
        boolean esContraseñaValida = servicioValidacion.validarContraseña(usuario); 

        System.out.println("Autenticado: " + esAutenticado); 
        System.out.println("Contraseña válida: " + esContraseñaValida);
    }
}
