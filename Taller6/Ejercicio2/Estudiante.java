package Taller6.Ejercicio2;


public class Estudiante {
    private String nombre; 
    private int edad;

    // Constructor por defecto
    public Estudiante() {
        this("NN", 0);
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad; 
    }

    // Método para imprimir los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}