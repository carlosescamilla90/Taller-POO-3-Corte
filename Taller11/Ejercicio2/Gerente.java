package Taller11.Ejercicio2;

public class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
