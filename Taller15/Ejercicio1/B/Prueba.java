package Taller15.Ejercicio1.B;

public class Prueba { 
    public static void main(String[] args) { 
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "34343434"); 
        GeneradorReporte generador = new GeneradorReporte(); 
        PersistenciaLibro persistencia = new PersistenciaLibro(); 

        generador.generarReporte(libro); 
        persistencia.guardar(libro); 
    }
}

