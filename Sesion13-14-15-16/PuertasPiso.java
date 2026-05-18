class PuertasPiso extends Puertas {

    private int numeroPiso;

    public PuertasPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    @Override
    public void abrir() {
        System.out.println("Puertas del piso " + numeroPiso + " abiertas.");
    }

    @Override
    public void cerrar() {
        System.out.println("Puertas del piso " + numeroPiso + " cerradas.");
    }
}