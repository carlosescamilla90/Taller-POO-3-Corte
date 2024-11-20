package Taller5.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades(); 

        double suma = utilidades.sumar(8, 5);
        System.out.println("Suma de 8 y 5: " + suma); 

        double resta = utilidades.restar(23, 14);
        System.out.println("Resta de 10 y 4: " + resta);

        double multiplicacion = utilidades.multiplicar(22, 2);
        System.out.println("Multiplicación de 7 y 2: " + multiplicacion); 

        double division = utilidades.dividir(45, 5);
        System.out.println("División de 20 y 4: " + division);

        double divisionPorCero = utilidades.dividir(3, 0);
        System.out.println("División de 10 y 0: " + divisionPorCero); 
    }
}