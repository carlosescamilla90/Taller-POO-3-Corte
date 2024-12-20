package Taller1.EjercicioFinal;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto 
    public Libro() {
        this.titulo = "NN"; 
        this.autor = "NN";  
        this.numeroPaginas = 0;     
    }

    // Constructor parametrizado que permite asignar valores específicos
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;            
        this.autor = autor;              
        this.numeroPaginas = numeroPaginas; 
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Titulo: " + this.titulo); 
        System.out.println("Autor: " + this.autor);  
        System.out.println("Número de páginas: " + this.numeroPaginas);
        } 

    // Método principal para probar la clase
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        libro1.mostrarDetalles(); 

        Libro libro2 = new Libro("20mil Leguas de Viaje Submarino ", "Julio Verne", 328);
        libro2.mostrarDetalles(); 
}
}
