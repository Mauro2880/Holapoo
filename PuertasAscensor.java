class PuertasAscensor extends Puertas {

    private int numeroAscensor;

    public PuertasAscensor(int idAscensor) {
        this.numeroAscensor = idAscensor;
    }

    @Override
    public void abrir() {
        System.out.println("Puertas del ascensor " + numeroAscensor + " abiertas.");
    }

    @Override
    public void cerrar() {
        System.out.println("Puertas del ascensor " + numeroAscensor + " cerradas.");
    }
}
