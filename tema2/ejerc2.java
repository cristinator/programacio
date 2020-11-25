import java.util.Scanner;

public class ejerc2 {
            
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
            int a = 0;
            int b = 0;
            int c = 0;
            System.out.println("Escribe el primer numero: ");
            a = sc.nextInt();
            System.out.println("Escribe el segundo numero: ");
            b = sc.nextInt();   
            c = a;
            a = b;
            b = c;
            System.out.println("el primer numero es:" + a);
            System.out.println("el segundo numero es:" + b);
        }
}