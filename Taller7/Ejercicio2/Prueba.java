package Taller7.Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        double suma = Matematicas.sumar(9, 1);
        System.out.println("Suma de 5 y 3: " + suma);

        double resta = Matematicas.restar(8, 2);
        System.out.println("Resta de 10 y 4: " + resta); 

        double multiplicacion = Matematicas.multiplicar(4, 6);
        System.out.println("Multiplicación de 7 y 2: " + multiplicacion); 

        double division = Matematicas.dividir(25, 5);
        System.out.println("División de 25 y 5: " + division); 

        double divisionPorCero = Matematicas.dividir(5, 0);
        System.out.println("División de 10 y 0: " + divisionPorCero);
    }
}
