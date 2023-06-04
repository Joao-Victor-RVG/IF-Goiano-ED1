import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a , d ;
        System.out.println("Digite um numero de 3 casas:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        d = a % 100 / 10;
        System.out.println("Algarismo da casa das dezenas:" + d);

    }
}