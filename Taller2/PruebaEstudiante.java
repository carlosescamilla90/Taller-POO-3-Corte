package Taller2;

public class PruebaEstudiante {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1); 
        
        Estudiante estudiante2 = new Estudiante("Camilo", 17, 3.7);
        System.out.println(estudiante2); // Mostrar detalles del estudiante

        
        estudiante2.setNombre("Valentina");
        estudiante2.setEdad(26);
        estudiante2.setNotaPromedio(3.9);

        
        System.out.println(estudiante2);
    }
}
