package Taller3.Ejercicio2.vehiculos;

public class Moto extends Vehiculo {
    // Propiedad adicional específica de Moto
    private int cilindrada;

    // Constructor por defecto
    public Moto() {
        super("Moto");
        this.cilindrada = 0; 
    }

    // Constructor parametrizado
    public Moto(String tipo, int cilindrada) {
        super(tipo); 
        this.cilindrada = cilindrada;
    }

    // Método para obtener la cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    // Método para establecer la cilindrada
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada; 
    }

    // Método toString() para mostrar los detalles de la moto
    @Override
    public String toString() {
        return "Moto [tipo=" + getTipo() + ", cilindrada=" + cilindrada + "]";
    }
}