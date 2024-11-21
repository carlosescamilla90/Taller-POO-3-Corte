package Taller15.Ejercicio1.B;

public class GeneradorReporte { 

    public void generarReporte(Libro libro) { 
        System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ID: " + libro.getId());
    }
}
