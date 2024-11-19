// Definición de la clase CuentaBancaria
public class CuentaBancaria {
    // Propiedades de la clase
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto que inicializa las propiedades con valores predeterminados
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;                 
        this.tipoCuenta = "NN"; 
    }

    // Constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta)
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  
        this.saldo = 0.0;                 
        this.tipoCuenta = tipoCuenta;   
    }

    // Constructor sobrecargado con tres parámetros (numeroCuenta, saldo y tipoCuenta)
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta; 
        this.saldo = saldo;                
        this.tipoCuenta = tipoCuenta;     
    }

    // Método para mostrar los detalles de la cuenta bancaria
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + this.numeroCuenta); 
        System.out.println("Saldo: " + this.saldo);                   
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);    
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
       
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles(); 
        
        CuentaBancaria cuenta2 = new CuentaBancaria("90100256664", "Ahorros");
        cuenta2.mostrarDetalles(); 

        CuentaBancaria cuenta3 = new CuentaBancaria("1019052042", "Corriente", 4000.0);
        cuenta3.mostrarDetalles(); 
    }
}