package Taller18.Ejercicio1;

public class ServicioMantenimiento implements Reparacion, Limpieza { 

    @Override
    public void reparar() { 
        System.out.println("Realizando reparacion."); 
    }

    @Override
    public void limpiar() { 
        System.out.println("Realizando limpieza."); 
    }
}
