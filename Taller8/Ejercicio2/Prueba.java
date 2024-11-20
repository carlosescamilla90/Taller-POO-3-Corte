package Taller8.Ejercicio2;

// Clase de prueba para las clases Persona y Estudiante
public class Prueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Andres", 34);
        persona1.mostrarInformacion();

        Estudiante estudiante1 = new Estudiante("Moises", 17, "M22376");
        estudiante1.mostrarInformacion();
    }
}

