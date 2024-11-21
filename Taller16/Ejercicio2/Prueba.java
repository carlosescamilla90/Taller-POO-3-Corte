package Taller16.Ejercicio2;

public class Prueba { 
    public static void main(String[] args) { 
        Documento documento = new Documento("Este es el contenido del documento."); 

        Exportador exportadorPDF = new ExportadorPDF(); 
        Exportador exportadorWord = new ExportadorWord(); 
        Exportador exportadorExcel = new ExportadorExcel();

        exportadorPDF.exportar(documento); 
        exportadorWord.exportar(documento); 
        exportadorExcel.exportar(documento); 
    }
}
