import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        do {
            System.out.println("Digite o número da pessoa (1 a 5):");
            num = scanner.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("\nNúmero fora do intervalo!");
            }
        } while (num < 1 || num > 5);

        System.out.println("Nome da pessoa " + num + ": " + nomes[num - 1]);
    }
}
