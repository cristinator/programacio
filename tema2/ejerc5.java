import java.util.Scanner;

public class ejerc5 {
    public static void main(String[] args) {
        double euro = 0;
        double result = 0;
        final double peseta = 166.386;
        Scanner sc = new Scanner(System.in); 
       System.out.println("inserte la cantidad en euros que desea convertir en pesetas");
       euro = sc.nextDouble();
       result = (euro * peseta);
       System.out.println("el resultado en pesetas es: " + result);

    }
}