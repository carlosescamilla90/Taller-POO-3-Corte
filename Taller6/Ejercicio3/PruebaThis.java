package Taller6.Ejercicio3;

public class PruebaThis {
   
    private String mensaje;

    public PruebaThis(String mensaje) {
        this.mensaje = mensaje;
    }

    // usar 'this' (esto generara un error)
    public static void metodoStatic() {
        
        System.out.println(this.mensaje);
    }

    // Método no estático que utiliza 'this' correctamente
    public void metodoNoStatic() {
        System.out.println(this.mensaje); 
    }

    public static void main(String[] args) {
     PruebaThis ejemplo = new PruebaThis("¡Hola, mundo!");
        ejemplo.metodoNoStatic();

        PruebaThis.metodoStatic(); 
    }
}
