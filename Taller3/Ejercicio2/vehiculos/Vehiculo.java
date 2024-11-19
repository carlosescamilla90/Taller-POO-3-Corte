package Taller3.Ejercicio2.vehiculos; 

public class Vehiculo {
    
    protected String tipo;

    // Constructor por defecto
    public Vehiculo() {
        this.tipo = "Desconocido"; 
    }

    // Constructor parametrizado
    public Vehiculo(String tipo) {
        this.tipo = tipo; // Inicializar el tipo
    }

    // Método para obtener el tipo de vehículo
    public String getTipo() {
        return tipo; 
    }

    // Método para establecer el tipo de vehículo
    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }

    // Método toString() para mostrar los detalles del vehículo
    @Override
    public String toString() {
        return "Vehiculo [tipo=" + tipo + "]";
    }
}