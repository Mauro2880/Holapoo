class BotonAscensor extends Boton {

    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public void seleccionarPiso() {
        System.out.println("Piso destino seleccionado: " + pisoDestino);
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