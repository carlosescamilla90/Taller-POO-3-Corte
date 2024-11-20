package Taller8.Ejercicios1;


public class Coche extends Vehiculo {
    // Atributo adicional para el número de puertas del coche
    private int numeroDePuertas;

    // Constructor de la clase Coche
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas; 
    }

    // Método para mostrar la información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Número de Puertas: " + numeroDePuertas); 
    }
}
