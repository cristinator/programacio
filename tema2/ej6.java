import java.util.Scanner;
public class ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = 0;
        double media = 0;
        double res = 0;
        System.out.println("introduce la nota del primer examen");
        nota1 = sc.nextDouble();
        System.out.println("introduce la media que deseas sacar en el trimestre");   
        media = sc.nextDouble();
        res = ((media*100) - (nota1 * 40)) /60;
        if(res<=10){
            System.out.println("Para podersacar un: " + nota1 + "Tienes que sacar en el segundo examen: " + res);
        }
        else{
            System.out.println("No se puede calcular la media");
        }
         
        }
}