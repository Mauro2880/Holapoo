package Clase12;
public class OperacionesConArreglos {

    // Crear arreglo
    public int[] crearArreglos(int tam) {
        int[] a = new int[tam];
        return a;
    }

    // Llenar arreglo
    public int[] llenarArreglos(int[] a) {
        int min = 1;
        int max = 10;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return a;
    }

    // Mostrar arreglo
    public void mostrarArreglo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}