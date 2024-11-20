package Taller7.Ejercicio1;

public class Coche {
    
    private String marca; 
    private String modelo; 
    private static int contadorCoches = 0;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca; 
        this.modelo = modelo; 
        contadorCoches++; 
    }

    
    public static void mostrarContadorCoches() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }

    
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
