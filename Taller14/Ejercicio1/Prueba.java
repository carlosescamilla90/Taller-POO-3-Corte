package Taller14.Ejercicio1;

public class Prueba { 
    public static void main(String[] args) { 
        Figura figura1 = new Circulo(5); 
        Figura figura2 = new Rectangulo(10, 7);

        figura1.calcularArea();
        figura2.calcularArea(); 
    }
}