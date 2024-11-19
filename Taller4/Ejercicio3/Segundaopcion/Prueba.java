package Taller4.Ejercicio3.Segundaopcion;
public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Banco
        Banco banco = new Banco(900.0);

        // Mostrar el saldo inicial
        banco.mostrarSaldo();

        // Depositar dinero
        banco.depositar(800.0);
        banco.mostrarSaldo();

        // Intentar retirar dinero
        banco.retirar(600.0);
        banco.mostrarSaldo();

        // Intentar retirar más dinero del disponible (debería lanzar una excepción)
        try {
            banco.retirar(2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Intentar establecer un saldo negativo (debería lanzar una excepción)
        try {
            banco.setSaldo(-300.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
