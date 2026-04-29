class Credito extends Pago {
    int numeroTarjeta;
    String nombre;

    public boolean hacerCargo(double total) {
        System.out.println("Pago con tarjeta realizado");
        return true;
    }
}