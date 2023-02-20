import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o logaritmando: ");
        double num = input.nextDouble();
        double log = Math.log10(num);
        System.out.println("logaritmo " + num + " na base 10 é " + log);
    }
}