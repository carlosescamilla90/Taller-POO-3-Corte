package Taller10.Ejercicio3.A;

class Base {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class Derivada extends Base {
    // Intentar sobrescribir el método cambiando su firma (esto no es sobrescritura)
    public void metodoBase(int parametro) {
        System.out.println("Método de la clase derivada con parámetro: " + parametro);
    }
}

public class Prueba {
    public static void main(String[] args) {
        Derivada derivada = new Derivada();
        derivada.metodoBase(); 
        derivada.metodoBase(10);
    }
}