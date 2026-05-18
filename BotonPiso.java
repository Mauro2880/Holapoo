class BotonPiso extends Boton {

    private int numeroPiso;
    private String direccion;

    public BotonPiso(int numeroPiso, String direccion) {
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
    }

    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Solicitud para ir " + direccion + " desde el piso " + numeroPiso);
    }

    @Override
    public void activarIndicador() {
        super.activarIndicador();
    }

    @Override
    public void desactivarIndicador() {
        super.desactivarIndicador();
    }
}