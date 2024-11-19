

public class Banco {
    // Propiedad protegida
    protected double saldo;

    // Constructor por defecto
    public Banco() {
        this.saldo = 0.0; 
    }

    // Constructor parametrizado
    public Banco(double saldo) {
        this.saldo = saldo; 
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
