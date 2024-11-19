package Taller2;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "NN"; 
        this.edad = 0;               
        this.notaPromedio = 0.0;     
    }

    // Constructor parametrizado
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.setNombre(nombre);        
        this.setEdad(edad);            
        this.setNotaPromedio(notaPromedio); 
    }

    // Métodos get y set con validaciones
    public String getNombre() {
        return nombre; 
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre; 
    }

    public int getEdad() {
        return edad; 
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser menor que cero."); 
        }
        this.edad = edad; 
    }

    public double getNotaPromedio() {
        return notaPromedio; 
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0.0 || notaPromedio > 5.0) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0.0 y 5.0."); 
        }
        this.notaPromedio = notaPromedio; 
    }

    // Método toString() para mostrar los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", notaPromedio=" + notaPromedio + "]";
    }
}