package Taller18.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(30000);

        cuenta.transferir(4000, "CuentaDestino123");
        cuenta.retirar(2500);
        cuenta.pagarFactura(5000, "Factura43"); 

        System.out.println("Saldo final: $" + cuenta.getSaldo()); 
    }
}
