package Taller16.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(10); 
        DescuentoFijo descuentoFijo = new DescuentoFijo(50); 

        double precioOriginal = 200; 

        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal); 
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal); 

        System.out.println("Precio original: $" + precioOriginal); 
        System.out.println("Precio con descuento del 10%: $" + precioConDescuentoPorcentaje);  
        System.out.println("Precio con descuento fijo de $50: $" + precioConDescuentoFijo); 
    }
}
