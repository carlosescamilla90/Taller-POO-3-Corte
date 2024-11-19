package Taller2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor por defecto
    public Coche() {
        this.marca = "NN"; 
        this.modelo = "NN";
        this.velocidadMaxima = 0;   
    }

    // Constructor parametrizado
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;                  
        this.modelo = modelo;               
        this.velocidadMaxima = velocidadMaxima; 
    }

    // Método para obtener la marca
    public String getMarca() {
        return marca; 
    }

    // Método para establecer la marca
    public void setMarca(String marca) {
        this.marca = marca; 
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo; 
    }

    // Método para establecer el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo; 
    }

    // Método para obtener la velocidad máxima
    public int getVelocidadMaxima() {
        return velocidadMaxima; 
    }

    // Método para establecer la velocidad máxima
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima; 
    }

    // Método para acelerar el coche
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento; 
        } else {
            System.out.println("El incremento debe ser mayor que cero.");
        }
    }

    // Método toString() para mostrar los detalles del coche
    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima + "]";
    }
}