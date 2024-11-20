package Taller8.Ejercicio2;


public class Estudiante extends Persona {
    private String matricula;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); 
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
   
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Matrícula: " + matricula);
    }
}
