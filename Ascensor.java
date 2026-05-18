class Ascensor {

    private int numero;
    private int pisoActual;

    private Puertas puertas;

    public Ascensor(int numero) {
        this.numero = numero;
        this.pisoActual = 0;

        this.puertas = new PuertasAscensor(numero);
    }

    public void mover() {
        System.out.println("Ascensor " + numero + " moviéndose.");
    }

    public void detener() {
        System.out.println("Ascensor " + numero + " detenido.");
    }
}