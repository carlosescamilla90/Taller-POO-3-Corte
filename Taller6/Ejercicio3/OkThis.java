package Taller6.Ejercicio3;

public class OkThis {
    private String mensaje;

    public OkThis(String mensaje) {
        this.mensaje = mensaje; 
    }

    public static void metodoStatic(OkThis instancia) {
        System.out.println(instancia.mensaje);
    }

    // Uso del 'this' correctamente
    public void metodoNoStatic() {
        System.out.println(this.mensaje);
    }

    public static void main(String[] args) {
        OkThis ejemplo = new OkThis("¡Hola, mundo!");
        ejemplo.metodoNoStatic();

        
        OkThis.metodoStatic(ejemplo);
    }
}