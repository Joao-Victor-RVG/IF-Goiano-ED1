import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L;
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];

        // Trecho de entrada
        for (L = 0; L <= 4; L++) {
            System.out.print("\ndigite " + (L + 1) + "º nome: ");
            nomes[L] = input.nextLine();
            System.out.print("Digite a primeira nota: ");
            pr1[L] = input.nextDouble();
            System.out.print("Digite a segunda nota: ");
            pr2[L] = input.nextDouble();
            media[L] = (pr1[L] + pr2[L]) / 2;
            input.nextLine(); // Limpar o buffer do scanner
        }

        // Trecho de saída
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for (L = 0; L <= 4; L++) {
            System.out.println((L + 1) + " - " + nomes[L] + ": " + pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }
    }
}