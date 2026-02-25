import java.util.Scanner;

public class Guia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        
        
        
        
        
        */
        System.out.print("Digite el peso:");
        int peso = sc.nextInt();

        if (peso < 40) {
            System.out.println("Menos de 40 Kg");
        } else {
            if (peso >= 40 && peso < 50) {
                System.out.println("Entre 40 y 50 Kg");
            } else {
                if (peso >= 50 && peso < 60) {
                    System.out.println("Mas de 50 Kg y menos de 60 Kg");
                } else {
                    System.out.println(" Mas o igual a 60 Kg");
                }
            }
        }

        sc.close();
    }
}
