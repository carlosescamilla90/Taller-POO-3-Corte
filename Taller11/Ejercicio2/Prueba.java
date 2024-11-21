package Taller11.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Valeria", 25, 3000, 2000);
        gerente.mostrarDetalles(); 

        Empleado vendedor = new Vendedor("Pedro", 35, 4000, 1500);
        vendedor.mostrarDetalles(); 
    }
}
