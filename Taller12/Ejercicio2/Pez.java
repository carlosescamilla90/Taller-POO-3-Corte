package Taller12.Ejercicio2;

public class Pez implements Respirador, Nadador {
    @Override
    public void respirar() { 
        System.out.println("Esta volando."); 
    }

    @Override
    public void nadar() { 
        System.out.println("Esta nadando.");
    }
}
