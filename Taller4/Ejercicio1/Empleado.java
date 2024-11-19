package Taller4.Ejercicio1;

// Clase Empleado con las propiedades nombre y salario como protegidas
class Empleado {
    protected String nombre;  
    protected double salario; 

    // Constructor de la clase Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}

// Clase Gerente que hereda de Empleado y tiene una propiedad adicional departamento
class Gerente extends Empleado {
    private String departamento; 

    // Constructor de la clase Gerente
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); 
        this.departamento = departamento; 
    }

    // Método para mostrar toda la información del empleado y del gerente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre); 
        System.out.println("Salario: " + salario); 
        System.out.println("Departamento: " + departamento); 
    }
}