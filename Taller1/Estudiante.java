package Taller1;

public class Estudiante {
    private String nombre; 
    private int edad;      
    private String curso; 

    // Constructor por defecto que asigna valores genéricos
    public Estudiante() {
        this.nombre = "NN"; 
        this.edad = 0;               
        this.curso = "NN";     
    }

    // Constructor que acepta nombre y edad como parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;    
        this.curso = "NN"; 
    }

    // Constructor que acepta todos los parámetros y utiliza this() para llamar a otro constructor
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso; 
    }

    // Método toString() para mostrar los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
    }
}
