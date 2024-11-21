package Taller1.Ejercicio1;


public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroPaginas;

    
    public Libro() {
        this.titulo = "Desconocido"; 
        this.autor = "Desconocido";  
        this.numeroPaginas = 0;     
    }

    
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;           
        this.autor = autor;              
        this.numeroPaginas = numeroPaginas; 
    }

   
    public void mostrarDetalles() {
        System.out.println("Titulo: " + this.titulo); 
        System.out.println("Autor: " + this.autor);   
        System.out.println("Número de páginas: " + this.numeroPaginas); 
    }

 
    public static void main(String[] args) {
       
        Libro libro1 = new Libro();
        libro1.mostrarDetalles(); 

        
        Libro libro2 = new Libro("El Amor en los Tiempos del Colera", "Gabriel Garcia Marquez", 250);
        libro2.mostrarDetalles(); 
    }
}
