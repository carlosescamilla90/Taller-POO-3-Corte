package Taller13.Ejercicio1;

public class Prueba {
    public static void main(String[] args) { 
        Figura rectangulo = new Rectangulo(10, 6); 
        Figura triangulo = new Triangulo(6, 9);  

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea()); 
    }
}
