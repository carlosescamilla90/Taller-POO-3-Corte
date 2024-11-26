package Taller12.Ejercicio1;

public class Ave implements Volador, Cantante {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando.");
    }

    @Override
    public void Volar() {
        System.out.println(nombre + " está Volando.");
    }
}
