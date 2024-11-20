package Taller5.Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("123456789", 1000, "Ahorros");

        // Acceder directamente a la propiedad privada causará un error
        System.out.println("Número de Cuenta : " + miCuenta.numeroCuenta);

        // revisar y asignar saldo
        System.out.println("Saldo inicial: " + miCuenta.getSaldo());
        miCuenta.setSaldo(1500); // Establecer un nuevo saldo válido
        System.out.println("Nuevo Saldo: " + miCuenta.getSaldo());

        
        miCuenta.setSaldo(-500);
        System.out.println("Saldo después de intento inválido: " + miCuenta.getSaldo());

        
        miCuenta.mostrarDetalles();
    }
}
