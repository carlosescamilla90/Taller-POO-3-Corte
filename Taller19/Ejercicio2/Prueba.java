package Taller19.Ejercicio2;

public class Prueba { 
    public static void main(String[] args) { 
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal(); 
        Almacenamiento almacenamientoNube = new AlmacenamientoNube(); 

        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal); 
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube); 

        gestorLocal.guardar("archivo1.txt", "Contenido del archivo 1");
        gestorNube.guardar("archivo2.txt", "Contenido del archivo 2"); 

        System.out.println("Recuperado localmente: " + gestorLocal.recuperar("archivo1.txt")); 
        System.out.println("Recuperado en la nube: " + gestorNube.recuperar("archivo2.txt"));
    }
}
