package Taller4.Ejercicio2;

// Definición de la clase Vehículo
class Vehiculo {
    protected String tipo; 
    protected String marca; 

    // Constructor de la clase Vehículo
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}

// Definición de la subclase Moto que hereda de Vehículo
class Moto extends Vehiculo {
    private int cilindrada;

    // Constructor de la clase Moto
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); 
        this.cilindrada = cilindrada;
    }

    // Método para mostrar la información de la moto
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca); 
        System.out.println("Cilindrada: " + cilindrada);
    }
}


