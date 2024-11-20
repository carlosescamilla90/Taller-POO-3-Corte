package Taller7.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
       
        Coche coche1 = new Coche("Kia", "Sportage");
        Coche coche2 = new Coche("Hyundai", "Tucson");
        Coche coche3 = new Coche("Tesla", "1");
         
        coche1.mostrarDetalles();
        coche2.mostrarDetalles();
        coche3.mostrarDetalles();

        Coche.mostrarContadorCoches();
    }
}

