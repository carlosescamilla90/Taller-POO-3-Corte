


public class Prueba {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Touring", "Bajac", 400);
        miMoto.mostrarInformacion();

        // Intentando acceder a datos protegidos desde una clase no relacionada
        // Esto causará errores de compilación
        System.out.println("Tipo (acceso directo): " + miMoto.tipo);
        System.out.println("Marca (acceso directo): " + miMoto.marca);
    }
}