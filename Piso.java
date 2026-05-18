class Piso {

    private int numero;

    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero) {

        this.numero = numero;

        botonSubir = new BotonPiso(numero, "arriba");
        botonBajar = new BotonPiso(numero, "abajo");
    }

    public void solicitarSubir() {
        botonSubir.presionar();
    }

    public void solicitarBajar() {
        botonBajar.presionar();
    }
}