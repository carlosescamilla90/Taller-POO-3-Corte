package Taller3;

class Producto {
    String nombre;
    double precio;
    int stock;

    //Constructor con acceso de paquete que inicializa todas las propiedades
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Método con acceso de paquete
    void mostrarInfo() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " ud");
    }
}

//Clase de prueba en el mismo paquete
class ProductoPrueba {
    public static void main(String[] args) {
        Producto miProducto = new Producto("Arroz Diana", 4000.00, 35);
    
        System.out.println("Nombre del producto: " + miProducto.nombre);
        System.out.println("Precio del producto: " + miProducto.precio);
        System.out.println("Stock del producto: " + miProducto.stock);
        
        
        miProducto.mostrarInfo();
    }
}