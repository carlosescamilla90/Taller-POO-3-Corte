package Taller19.Ejercicio3;

public class ReportePDF implements GeneradorReporte { 
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en PDF con el contenido: " + contenido);
    }
}
