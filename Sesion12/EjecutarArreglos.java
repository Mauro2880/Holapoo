package Clase12;
 
public class EjecutarArreglos {
    public static void main(String[] args) {
       
        OperacionesConArreglos objArreglos = new OperacionesConArreglos();
 
        objArreglos.mostrarArreglo(objArreglos.llenarArreglo(objArreglos.crearArreglo(10), -5, 10));
    }
}