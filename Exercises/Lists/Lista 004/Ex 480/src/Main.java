import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, x;
        System.out.print("Digite um número: ");
        n = input.nextInt();

        x = reverso(n);

        System.out.print("\n" + n + " - ");

        if (x == n) {
            System.out.print("\nÉ um número capicua");
        } else {
            System.out.print("\nNão é um número capicua");
        }

        System.out.print("\n");
    }

    public static int reverso(int num) {
        int reverso = 0;
        while (num > 0) {
            reverso = reverso * 10 + num % 10;
            num /= 10;
        }
        return reverso;
    }
}
