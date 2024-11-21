package Taller16.Ejercicio2;

public class ExportadorPDF implements Exportador { 
    @Override
    public void exportar(Documento documento) { 
        System.out.println("Exportando el documento a PDF: " + documento.getContenido());
    }
}
