package Taller19.Ejercicio3;

public class Prueba { 
    public static void main(String[] args) { 
        GeneradorReporte reportePDF = new ReportePDF(); 
        GeneradorReporte reporteExcel = new ReporteExcel(); 

        GestorReporte gestorPDF = new GestorReporte(reportePDF); 
        GestorReporte gestorExcel = new GestorReporte(reporteExcel); 

        gestorPDF.generar("Contenido del reporte PDF"); 
        gestorExcel.generar("Contenido del reporte Excel"); 
    }
}

