class Pago {
    double subtotal;
    double propina;
    double impuestos;

    public double calcularTotal() {
        return subtotal + propina + impuestos;
    }
}