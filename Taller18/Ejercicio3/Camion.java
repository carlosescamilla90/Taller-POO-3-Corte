package Taller18.Ejercicio3;

public class Camion implements Conduccion, CargaMercancias {
    @Override
    public void conducir() { 
        System.out.println("El camión está conduciendo."); 
    }

    @Override
    public void cargarMercancia() { 
        System.out.println("El camión está cargando mercancia."); 
    }
}

