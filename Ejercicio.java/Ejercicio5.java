class Perfume {
    String nombre;
    String marca;
    double capacidad;
    double precio;
    public Perfume(String nombre, String marca, double capacidad, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
}
void aplicarPerfume(double cantidad) {
    if (cantidad<=capacidad){
        capacidad -= cantidad;
        System.out.println("Perfume usado");
    } else {
            System.out.println("No hay suficiente perfume");
        }  
    }    
void consultarCantidadRestante(){
    System.out.println("Cantidad restante: " + capacidad);
}

void ajustarPrecio(double nuevoPrecio){
    precio = nuevoPrecio;
    }
}