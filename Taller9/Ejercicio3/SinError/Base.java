package Taller9.Ejercicio3.SinError;

class Base {
    private int atributoPrivado = 8;

    public int getAtributoPrivado() {
        return atributoPrivado;
    }
}

class Derivada extends Base {
    public void mostrarAtributoPrivado() {
        System.out.println("Atributo Privado: " + super.getAtributoPrivado());
    }
}

public class PruebaSuper {
    public static void main(String[] args) {
        Derivada derivada = new Derivada();
        derivada.mostrarAtributoPrivado();
    }
}
