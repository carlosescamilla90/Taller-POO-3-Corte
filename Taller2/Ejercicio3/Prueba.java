package Taller2.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("David");

        // Intentar acceder directamente a la propiedad privada
        
         System.out.println(cliente.nombre); // Error: nombre tiene acceso privado en Cliente
    }
}