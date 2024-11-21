package Taller19.Ejercicio3;

public class GestorReporte { 
    private GeneradorReporte generadorReporte; 

    public GestorReporte(GeneradorReporte generadorReporte) { 
        this.generadorReporte = generadorReporte;
    }

    public void generar(String contenido) { 
        generadorReporte.generarReporte(contenido); 
    }
}