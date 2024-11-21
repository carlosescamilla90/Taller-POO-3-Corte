package Taller17.Ejercicio2;

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double cantidad); 
    public abstract void retirar(double cantidad); 
}

