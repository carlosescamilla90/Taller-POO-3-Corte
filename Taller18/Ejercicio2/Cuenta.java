package Taller18.Ejercicio2;

public class Cuenta implements Transferencia, Retiro, PagoFactura { 
    private double saldo;

    public Cuenta(double saldoInicial) { 
        this.saldo = saldoInicial;
    }

    @Override
    public void transferir(double monto, String cuentaDestino) { 
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Transferencia de $" + monto + " a la cuenta " + cuentaDestino + " realizada con exito.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    @Override
    public void retirar(double monto) { 
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado con exito.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    @Override
    public void pagarFactura(double monto, String factura) { 
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Pago de factura de $" + monto + " para " + factura + " realizado con exito.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public double getSaldo() { 
        return saldo;
    }
}
