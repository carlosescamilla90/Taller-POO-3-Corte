package Taller12.Ejercicio2;

public class Animal implements Volador, Nadador {
    @Override
    public void volar() { 
        System.out.println("Esta volando."); 
    }

    @Override
    public void nadar() { 
        System.out.println("Esta nadando.");
    }
}
