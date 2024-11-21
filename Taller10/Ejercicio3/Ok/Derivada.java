package Taller10.Ejercicio3.Ok;

public class Derivada extends Base {
    @Override
    public void metodo() {
        System.out.println("Método de la clase Derivada");
    }

    public static void main(String[] args) {
        Derivada obj = new Derivada();
        obj.metodo();
    }
}