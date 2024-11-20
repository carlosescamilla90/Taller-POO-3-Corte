package Taller7.Ejercicio3;

public class ErrorEstatic {
    private int contador;

    public ErrorEstatic(int contador) {
        this.contador = contador;
    }

    
    public static void incrementarContador() {
        // Error: al utilizar 'this' 
        this.contador++;
    }

    
    public int getContador() {
        return contador; 
    }

    public static void main(String[] args) {
        ErrorEstatic ejemplo = new ErrorEstatic(2);

        
        System.out.println("Contador inicial: " + ejemplo.getContador());

        
        ErrorEstatic.incrementarContador(); 
    }
}