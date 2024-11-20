package Taller7.Ejercicio3;

public class OkEstatic {

    private int contador;

    public OkEstatic(int contador) {
        this.contador = contador;
    }

    public static void incrementarContador(OkEstatic instancia) {
        
        instancia.contador++; 
    }

    public int getContador() {
        return contador;
    }
    
    public static void main(String[] args) {
        OkEstatic ejemplo = new OkEstatic(5);
        System.out.println("Contador inicial: " + ejemplo.getContador());
        OkEstatic.incrementarContador(ejemplo);

        System.out.println("Contador luego de incrementar: " + ejemplo.getContador());
    }
}