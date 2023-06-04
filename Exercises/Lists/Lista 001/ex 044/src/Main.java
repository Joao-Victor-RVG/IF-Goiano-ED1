import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o número: ");
        double num = sc.nextDouble();
        System.out.print("Digite a base: ");
        double base = sc.nextDouble();


        double logaritmo = Math.log(num) / Math.log(base);

        System.out.println("O logaritmo de " + num + " na base " + base + " é igual a " + logaritmo);
    }
}
