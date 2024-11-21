package Taller16.Ejercicio2;

public class Documento { 
    private String contenido; 

    public Documento(String contenido) { 
        this.contenido = contenido;
    }

    public void exportarPDF() { 
        System.out.println("Exportando el documento a PDF con el contenido: " + contenido);
    }

    public String getContenido() {
        return contenido;
    }
}
