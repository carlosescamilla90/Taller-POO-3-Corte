package Taller11.Ejercicio3.B;

abstract class ClaseAbstracta {
    public void metodoConcreto() {
        System.out.println("Método concreto de la clase abstracta");
    }

    public abstract void metodoAbstracto();
}

class ClaseDerivada extends ClaseAbstracta {
    @Override
    public void metodoConcreto() {
        System.out.println("Método sobreescrito en la clase derivada");
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("Implementación del método abstracto en la clase");
    }
}

public class Prueba {
    public static void main(String[] args) {
        ClaseDerivada derivada = new ClaseDerivada();
        derivada.metodoConcreto();
        derivada.metodoAbstracto();
    }
}
