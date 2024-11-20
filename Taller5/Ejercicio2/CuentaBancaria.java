package Taller5.Ejercicio2;


public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    // Constructor de la clase CuentaBancaria
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta; 
        this.saldo = saldo; 
        this.tipoCuenta = tipoCuenta;
    }

    // Método getter para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método setter para establecer el saldo con validación
    public void setSaldo(double saldo) {
        if (saldo >= 0) { 
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser menos que cero.");
        }
    }

    // Método público para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta); 
        System.out.println("Saldo: " + saldo); 
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
}