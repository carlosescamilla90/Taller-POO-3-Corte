package Taller17.Ejercicio2;

public class Prueba { 
    public static void main(String[] args) { 
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1500, 0.05); 
        cuentaAhorros.depositar(1000); 
        cuentaAhorros.retirar(400); 

        ((CuentaAhorros) cuentaAhorros).aplicarInteres(); 

        System.out.println("Saldo final: " + cuentaAhorros.getSaldo()); 
    }
}
