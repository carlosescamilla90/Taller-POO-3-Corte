package Taller3.Ejercicio3;


public class Prueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);

        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Carlos");
        System.out.println("Nombre modificado: " + persona.getNombre());

        System.out.println("Edad: " + persona.edad);
        persona.edad = 30;
        System.out.println("Edad modificada: " + persona.edad);
    }
}

