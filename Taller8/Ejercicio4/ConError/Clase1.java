package Taller8.Ejercicio4.ConError;

class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

class ClaseB {
    public void metodoB() {
        System.out.println("Método de ClaseB");
    }
}


class ClaseC extends ClaseA, ClaseB {
    public void metodoC() {
        System.out.println("Método de ClaseC");
    }
}