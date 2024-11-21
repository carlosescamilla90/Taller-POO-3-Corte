package Taller16.Ejercicio2;

public class ExportadorExcel implements Exportador { 
    @Override
    public void exportar(Documento documento) { 
        System.out.println("Exportando el documento a Excel : " + documento.getContenido());
    }
}

