import java.util.Scanner;

public class condicionales {

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //Leer dos números y deducir si están en orden creciente. a < = b
    int a = 0, b = 0;
    System.out.println("Digite a: "); //Solicitamospor teclado el valor a
    a = sc.nextInt();// Capturamos por teclado el valor de "a"
    System.out.println();
    System.out.print("Digite b: ");
    b = sc.nextInt();
    if(a <= b){
        System.out.println("Orden creciente");
    }else{
        System.out.println("Orden decreciente");
    }
    sc.close();
    }
}