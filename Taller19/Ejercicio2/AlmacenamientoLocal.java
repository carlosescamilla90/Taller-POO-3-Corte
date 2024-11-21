package Taller19.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento { 
    private Map<String, String> almacenamiento = new HashMap<>(); 

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) { 
        almacenamiento.put(nombreArchivo, contenido); 
        System.out.println("Archivo guardado localmente: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) { 
        return almacenamiento.get(nombreArchivo); 
    }
}

