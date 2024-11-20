package Taller8.Ejercicio2Continuacion;


public class Estudiante extends Persona {
    private String matricula;

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

