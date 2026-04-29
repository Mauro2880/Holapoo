// Clase principal para ejecutar
public class Restaurante {
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente(5, 3);

        // Crear orden
        Orden orden = new Orden(12, "Juan");

        // Crear platillos
        Platillo p1 = new Platillo(2, "Pizza");
        Platillo p2 = new Platillo(1, "Hamburguesa");

        // Crear bebidas
        Bebida b1 = new Bebida(2, "Coca-Cola");

        // Crear pago (Efectivo)
        Efectivo pago = new Efectivo();
        pago.subtotal = 50000;
        pago.propina = 5000;
        pago.impuestos = 9500;
        pago.cantidad = 64500;

        // Mostrar información
        System.out.println("Mesa: " + cliente.mesa);
        System.out.println("Comensales: " + cliente.comensales);

        System.out.println("Mesero: " + orden.mesero);
        System.out.println("Hora: " + orden.hora);

        System.out.println("Platillo 1: " + p1.tipo);
        System.out.println("Platillo 2: " + p2.tipo);

        System.out.println("Bebida: " + b1.tipo);

        System.out.println("Total a pagar: " + pago.calcularTotal());
    }
}