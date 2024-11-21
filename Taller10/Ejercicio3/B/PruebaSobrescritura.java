package Taller10.Ejercicio3.B;

class Base {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class Derivada extends Base {
    public void metodoBase() {
        System.out.println("Método sobrescrito en la clase derivada");
    }
}

public class PruebaSobrescritura {
    public static void main(String[] args) {
        Derivada derivada = new Derivada();
        derivada.metodoBase();
    }
}