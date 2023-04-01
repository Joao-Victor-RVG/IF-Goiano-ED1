import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nome = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite palavra em letras minusculas " + (i+1) + ": ");
            nome[i] = scanner.nextLine();
            nome[i] = restantes(nome[i], nome[i].length(), "c");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + nome[i]);
        }
    }

    private static String restantes(String str, int tamanho, String letra) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = tamanho; i < 10; i++) {
            sb.append(letra);
        }
        return sb.toString();
    }
}
