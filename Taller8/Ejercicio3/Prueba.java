package Taller8.Ejercicio3;

// Clase de prueba para las clases Empleado y Gerente
public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pedro Motoa", 5500);
        empleado1.mostrarDetalles();

        
        Gerente gerente1 = new Gerente("Valeria Olave", 4000, "Contabilidad");
        gerente1.mostrarDetalles();
    }
}
