package Taller19.Ejercicio3;

public class ReporteExcel implements GeneradorReporte { 

    @Override
    public void generarReporte(String contenido) { 
        System.out.println("Generando reporte en Excel con el contenido: " + contenido);
    }
}
