package Taller13.Ejercicio3;

abstract class ClaseAbs {
    public void metodoConcreto() {
        System.out.println("Método concreto de la clase abstracta");
    }

    
    public default void metodoPredeterminado() {
        System.out.println("Método predeterminado de la clase abstracta");
    }
}

public class PruebaClasesAbstractas {
    public static void main(String[] args) {
        ClaseAbs objeto = new ClaseAbs() {
            @Override
            public void metodoConcreto() {
                System.out.println("Método concreto sobrescrito");
            }
        };
        objeto.metodoConcreto();
        objeto.metodoPredeterminado(); 
    }
}
