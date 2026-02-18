// Varible= Computacionalmente hablando es reservar un espacio en memoria

// Se declara la varible "a" de tipo entero int a;
// Asigna el valor de 5 a la variblea "a" a = 5;
// int b;
// b = 3;

// Tipos de datos en JAVA
 / Numericos 
 / Enteros (int, long) = 3
 / Reales (Float, double) = 4.5
 / Cadenas (string) "Mauro Esteban"
 / Caracter (Char) ´a´
 / Logicos (Boolean) True or False
// Expresiones Matematicas (PEMDAS)
 / Parentesis 
 / Exponente
 / Multiplicacion
 / Division
 / Suma
 / Resta 

// Si el valor de A es 4, el valor de B es 5 y el valor
// de C es 1, evaluar las siguientes expresiones:
 /a) B * A – B ^ 2 / 4 * C
   5 * 4 - 5 ^ 2 / 4 * 1
   5 * 4 - 25 / 4 * 1
	20 - 6.25 * 1
	20 - 6.25 = 13.75
 /b) (A * B) / 3 ^ 2
   (4 * 5) / 3 ^ 2
	 20 / 9 = 2.2222
 /c) (((B + C) / 2 * A + 10) * 3 * B) –
 	 (((5 + 1) / 2 * 4 + 10) * 3 * 5) - 6
     ((	6	 / 2 * 4 + 10) * 3 * 5) - 6
     ((		  3 + 4 + 10) * 3 * 5) - 6
     ( 22 * 3 * 5) - 6
			330 - 6 = 324

public class SemanaDos {
  public static void main(String args[]) {
    //Comentario de una sola línea
    /*
     * Comentario
     * de varias
     * líneas
     */
    // las llaves { } se llaman delimitares de código 

    // mas (+) significa concatenar dentro de un System.out.println
    //Variables de tipo entero
    int a = 5;
    long b = 10;
    //Variables de tipo real
    float m = 5.0f;
    double nota = 3.8;
    //Variable de tipo cadena
    String nombre = "Programación Orientada a Objetos";
    //Variables de tipo caracter
    char letra = 'w';
    //Variables de tipo lógico
    boolean flag = true; // false
    System.out.println("la nota es: " + nota);
     //----------Expresiones Matemáticas---------------------
        double a = 4.0;
        double b = 5.0;
        double c = 1.0;
        
        double exp1 = (b * a) - Math.pow(b,2) / 4 * c;
        System.out.println(exp1);
        
        double exp2 = (a * b) / Math.pow(3, 2);
        System.out.println(exp2);
        
        double exp3 = (((b + c) / 2 * a + 10) * 3 * b) - 6;
        System.out.println(exp3);
        
    }
}