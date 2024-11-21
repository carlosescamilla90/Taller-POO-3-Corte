package Taller15.Ejercicio2.B;

public class Prueba { 
    public static void main(String[] args) { 
        Producto producto = new Producto("Celular", 12000.0, 0.19); 
        GeneradorEtiqueta generador = new GeneradorEtiqueta();
        PersistenciaProducto persistencia = new PersistenciaProducto(); 

        generador.generarEtiqueta(producto);
        persistencia.guardar(producto); 
    }
}

