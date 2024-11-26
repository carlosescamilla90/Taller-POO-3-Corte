package Taller16.Ejercicio1;

public class DescuentoFijo extends Descuento { 
    private double cantidadFija; 

    public DescuentoFijo(double cantidadFija) { 
        super(0); 
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) { 
        return precioOriginal - cantidadFija; 
    }

    public double getCantidadFija() { 
        return cantidadFija;
    }
}
