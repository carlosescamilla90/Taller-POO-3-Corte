package Taller4.Ejercicio3.Segundaopcion; 
public class Banco {
    // Propiedad privada
    private double saldo;

    // Constructor por defecto
    public Banco() {
        this.saldo = 0.0; 
    }

    // Constructor parametrizado
    public Banco(double saldo) {
        this.setSaldo(saldo);
    }

    // Método get para saldo
    public double getSaldo() {
        return saldo; 
    }

    // Método set para saldo con validación
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser menor que cero."); 
        }
        this.saldo = saldo; 
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad; 
        } else {
            throw new IllegalArgumentException("El valor a depositar debe ser mayor a cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad; 
        } else {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
    }
}
