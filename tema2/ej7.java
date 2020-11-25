import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte el valor de x");
        x = sc.nextDouble();
        System.out.println("inserte el valor de y");
        y = sc.nextDouble();
        z = (1 + ((x * x) / y)) / ((x * x * x) / (1 + y));
        System.out.println("El resultado de z es:" + z);
    }
}