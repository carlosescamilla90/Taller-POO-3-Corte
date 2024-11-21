package Taller15.Ejercicio1.A;

public class Libro { 
    private String titulo; 
    private String autor;
    private String id; 

    public Libro(String titulo, String autor, String id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }

    public String getTitulo() { 
        return titulo;
    }

    public String getAutor() { 
        return autor;
    }

    public String getId() { 
        return id;
    }

    public void generarReporte() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ID: " + id);
    }

    public void guardar() { 
        System.out.println("Guardando el libro en la base de datos...");
    }
}
