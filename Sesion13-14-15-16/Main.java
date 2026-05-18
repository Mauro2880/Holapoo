public class Main {

    public static void main(String[] args) {

        SistemaControl sistema = new SistemaControl();

        Ascensor ascensor1 = new Ascensor(1);

        Piso piso1 = new Piso(1);
        Piso piso2 = new Piso(2);

        sistema.agregarAscensor(ascensor1);

        sistema.agregarPiso(piso1);
        sistema.agregarPiso(piso2);

        piso1.solicitarSubir();

        ascensor1.mover();
        ascensor1.detener();

        sistema.gestionarSolicitud(1, "arriba");

        sistema.asignarAscensor();
    }
}
