package Taller2;

public class PruebaCoche {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        System.out.println(coche1); 

       
        Coche coche2 = new Coche("Kia", "Sportage", 150);
        System.out.println(coche2); 
        

        // Usar los métodos get y set para acceder a las propiedades
        coche2.setMarca("Chevrolet");
        coche2.setModelo("hyundai");
        coche2.setVelocidadMaxima(170);

        // Mostrar los detalles modificados del coche
        System.out.println(coche2);

        // Probar el método acelerar
        coche2.acelerar(10);
        System.out.println("Después de acelerar: " + coche2);

        coche2.acelerar(20); 
    }
}