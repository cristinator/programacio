import java.util.Scanner;
public class ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int nino = 0;
        int chica = 0;
        
        System.out.println("Escribe el primer numero: ");
            a = sc.nextInt();
            System.out.println("Escribe el segundo numero: ");
            b = sc.nextInt(); 
            
        nino = (a * 100) / (a + b);
        chica = (b * 100) /(a + b);
        System.out.println("El porcentaje de niños en clase es: " + nino + "El porcentaje de niñas es: " + chica);
    }
}