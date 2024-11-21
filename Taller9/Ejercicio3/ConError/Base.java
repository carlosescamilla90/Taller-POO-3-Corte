package Taller9.Ejercicio3.ConError;

class Base {
    private int atributoPrivado = 10;

    public int getAtributoPrivado() {
        return atributoPrivado;
    }
}

class Derivada extends Base {
    public void mostrarAtributoPrivado() {
        System.out.println("Atributo Privado: " + super.atributoPrivado);
    }
}
