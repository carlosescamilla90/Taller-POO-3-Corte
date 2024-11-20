package Taller8.Ejercicios1;


public class Vehiculo {
    
    protected String marca; 
    protected int velocidadMaxima; 

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca; 
        this.velocidadMaxima = velocidadMaxima; 
    }

    // Método para mostrar 
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
