import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, base, c, converte;
        System.out.println("\ndigite numero maior ou igual a 0: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        while (num < 0) {
            System.out.println("InNumero negativo. Digite numero maior ou igual a 0: ");
            num = entrada.nextInt();
        }
        System.out.println("Indigite a base em deseja representa-lo (2-10): ");
        base = entrada.nextInt();
        while (base < 2 || base > 10) {
            System.out.println("\nNao sei converter. Digite a base em deseia representa-1o (2-10): ");
            base = entrada.nextInt();
        }
        c = converte(num, base);
        System.out.println("Innumero em decimal: " + num);
        System.out.println("Innumero na base " + base + " : " + c);
        System.out.println("\n");
        System.out.println("'n");
    }

    public static int converte(int num, int base) {
        int resultado = 0;
        int multiplicador = 1;
        while (num != 0) {
            int digito = num % base;
            resultado += digito * multiplicador;
            multiplicador *= 10;
            num /= base;
        }
        return resultado;
    }
}
