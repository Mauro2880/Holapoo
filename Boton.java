abstract class Boton {

    protected boolean activo;
    protected boolean indicadorLuminoso;

    public Boton() {
    }

    public void presionar() {
        activo = true;
        activarIndicador();
        System.out.println("Botón presionado.");
    }

    public void activarIndicador() {
        indicadorLuminoso = true;
        System.out.println("Indicador activado.");
    }

    public void desactivarIndicador() {
        indicadorLuminoso = false;
        System.out.println("Indicador desactivado.");
    }
}