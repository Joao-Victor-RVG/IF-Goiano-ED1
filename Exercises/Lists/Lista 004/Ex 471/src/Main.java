import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dividendo, divisor, menorNumero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        dividendo = scanner.nextInt();
        System.out.print("Digite o divisor: ");
        divisor = scanner.nextInt();

        menorNumero = Math.min(dividendo, divisor);

        while (menorNumero > dividendo) {
            System.out.print("INVALIDO. Digite um divisor menor que o dividendo: ");
            divisor = scanner.nextInt();
            menorNumero = Math.min(dividendo, divisor);
        }

        int n = divisor(dividendo, divisor);

        if (n == 0) {
            System.out.println("O divisor não cabe no dividendo nenhuma vez.");
        } else {
            System.out.println("O divisor cabe no dividendo " + n + " vezes.");
        }
    }

    public static int divisor(int dividendo, int divisor) {
        int contador = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            contador++;
        }
        return contador;
    }
}
