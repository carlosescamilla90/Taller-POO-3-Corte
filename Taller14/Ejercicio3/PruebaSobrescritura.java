package Taller14.Ejercicio3;

class ClaseBase {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class ClaseDerivada extends ClaseBase {
    @Override
    public void metodoBase() {
        
        super.metodoBase();
    }
}

public class PruebaSobrescritura {
    public static void main(String[] args) {
        ClaseDerivada objeto = new ClaseDerivada();
        objeto.metodoBase();
    }
}

