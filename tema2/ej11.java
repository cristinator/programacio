import java.util.Scanner;

public class ej11 {
  
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double exp1 = 0;
        double exp2 = 0;
        double exp3 = 0;
        Scanner sc = new Scanner(System.in);
    System.out.println("el primer valor es: " + a + "el segundo valor es: " + b);
    exp1 = 3.0/4*(a*a-b);
    exp2 = a/b * 0.1000 + 0.304;
    exp3 = (100.0 / a + b / 2.0) * 5.0;
    System.out.println("el valor de la expresion 1 es: " + exp1);
    System.out.println("el valor de la expresion 2 es: " + exp2);
    System.out.println("el valor de la expresion 3 es: " + exp3);
    }
}