import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, c, t, cont = 0;
        int[] media = new int[15];
        String[] nomes = new String[15], sit = new String[15];
        double[] pr1 = new double[15], pr2 = new double[15];

        // trecho de entrada de 15 nomes
        for (L = 0; L <= 14; L++) {
            System.out.printf("\n\nDigite %dº nome:\n", L + 1);
            nomes[L] = sc.nextLine();

            while (nomes[L].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres.");
                System.out.printf("Digite %dº nome:\n", L + 1);
                nomes[L] = sc.nextLine();
            }

            t = 30 - nomes[L].length();
            for (c = 1; c <= t; c++) {
                nomes[L] += " ";
            }

            System.out.println("Digite 1ª nota:");
            pr1[L] = Double.parseDouble(sc.nextLine());

            System.out.println("Digite 2ª nota:");
            pr2[L] = Double.parseDouble(sc.nextLine());

            media[L] = (int) ((pr1[L] + pr2[L]) / 2 + 0.0001);

            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }

        // trecho de saída
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for (L = 0; L <= 14; L++) {
            System.out.printf("%d - %s\t%.2f\t%.2f\t%d\t%s\n", L + 1, nomes[L], pr1[L], pr2[L], media[L], sit[L]);
        }
        System.out.println();

        sc.close();
    }
}
