import java.util.Scanner;

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Objeto de Libro
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine(); 
        System.out.print("Autor: ");
        String autor = scanner.nextLine(); 
        System.out.print("Numero de Paginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); 
        Libro libro = new Libro(titulo, autor, numeroPaginas); 

        //Objeto de CuentaBancaria
        System.out.println("Ingrese los datos de la cuenta bancaria:");
        System.out.print("Numero de Cuenta: ");
        String numeroCuenta = scanner.nextLine(); 
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble(); 
        scanner.nextLine(); 
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = scanner.nextLine(); 
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, tipoCuenta, saldo);

        //Objeto de Estudiante
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine(); 
        System.out.print("Edad: ");
        int edad = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.print("Curso: ");
        String curso = scanner.nextLine(); 
        Estudiante estudiante = new Estudiante(nombre, edad, curso); 

        // Mostrar los detalles de los objetos
        System.out.println("\nDetalles del Libro:");
        System.out.println(libro); 

        System.out.println("\nDetalles de la Cuenta Bancaria:");
        System.out.println(cuentaBancaria); 

        System.out.println("\nDetalles del Estudiante:");
        System.out.println(estudiante); 
        
        scanner.close(); 
    }
}
