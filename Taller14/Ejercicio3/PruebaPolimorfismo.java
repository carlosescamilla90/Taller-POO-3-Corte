package Taller14.Ejercicio3;

class ClaseBase {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class ClaseDerivada extends ClaseBase {
    public void metodoDerivado() {
        System.out.println("Método de la clase derivada");
    }
}

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        ClaseBase objeto = new ClaseDerivada();
        objeto.metodoBase();
        objeto.metodoDerivado(); 
    }
}

