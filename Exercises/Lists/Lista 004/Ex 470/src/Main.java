import java.util.Scanner;

public class Main {
    public static int primo(int num) {
        int contador = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                contador++;
                break;
            }
        }
        if (contador == 0 && num != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, pri;
        System.out.print("Digite um número > 0: ");
        num = input.nextInt();
        pri = primo(num);
        if (pri == 0) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}
