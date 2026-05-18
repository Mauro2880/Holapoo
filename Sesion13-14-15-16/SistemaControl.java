import java.util.ArrayList;
import java.util.List;

class SistemaControl {

    private List<Ascensor> ascensores;
    private List<Piso> pisos;

    public SistemaControl() {
        ascensores = new ArrayList<>();
        pisos = new ArrayList<>();
    }

    public void gestionarSolicitud(int piso, String direccion) {
        System.out.println("Gestionando solicitud desde piso " + piso + " hacia " + direccion);
    }

    public Ascensor asignarAscensor() {

        if (ascensores.isEmpty()) {
            return null;
        }

        System.out.println("Ascensor asignado.");
        return ascensores.get(0);
    }

    public void agregarAscensor(Ascensor ascensor) {
        ascensores.add(ascensor);
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }
}