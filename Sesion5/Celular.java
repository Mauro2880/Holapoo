public class Celular {

    //Atributos
    String marca;
    String modelo;
    int bateria = 100;

    //Metodo 
    public void llamar(String numero){
        System.out.println("Llamado al" + numero + "...");
        this.bateria -= 5;
    }
}