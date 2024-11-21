package Taller13.Ejercicio2;

public class Pato implements Volador, Nadador { 
    @Override
    public void volar() { 
        System.out.println("Estoy volando."); 
    }

    @Override
    public void nadar() { 
        System.out.println("Estoy nadando.");
    }
}

