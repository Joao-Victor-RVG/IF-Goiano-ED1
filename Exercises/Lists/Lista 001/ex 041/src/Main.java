import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Entre com 1 numero: ");
        double a = sc.nextDouble();

        System.out.print("Entre com 2 numero: ");
        double b = sc.nextDouble();

        System.out.print("Entre com 3 numero:  ");
        double c = sc.nextDouble();

        System.out.print("Entre com 4 numero:  ");
        double d = sc.nextDouble();


        double mP = (a*1 + b*2 + c*3 + d*4) / (1+2+3+4);


        System.out.printf("média ponderada: %.2f", mP);

        sc.close();
    }
}