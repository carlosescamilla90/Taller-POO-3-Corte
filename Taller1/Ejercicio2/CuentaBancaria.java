package Taller1.Ejercicio2;


public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;                 
        this.tipoCuenta = "NN"; 
    }

    
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  
        this.saldo = 0.0;                  
        this.tipoCuenta = tipoCuenta;     
    }

    
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  
        this.saldo = saldo;                
        this.tipoCuenta = tipoCuenta;     
    }

    
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + this.numeroCuenta); 
        System.out.println("Saldo: " + this.saldo);                   
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);     
    }

    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles(); 

        
        CuentaBancaria cuenta2 = new CuentaBancaria("00000678", "Ahorros");
        cuenta2.mostrarDetalles(); 

        
        CuentaBancaria cuenta3 = new CuentaBancaria("67800000", 13700.0, "Corriente");
        cuenta3.mostrarDetalles(); 
    }
}

