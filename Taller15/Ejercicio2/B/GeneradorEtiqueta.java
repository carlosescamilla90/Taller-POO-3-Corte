package Taller15.Ejercicio2.B;

public class GeneradorEtiqueta {

    public void generarEtiqueta(Producto producto) { 
        System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.calPrecioFinal());
    }
}
