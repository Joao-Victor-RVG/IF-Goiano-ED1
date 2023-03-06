import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precocompra = new double[100];
        double[] precovenda = new double[100];
        double lucro;
        int totlucromenor10 = 0;
        int totlucromenor20 = 0;
        int totlucromaior20 = 0;

        for (int A = 0; A < 100; A++) {
            System.out.print("Preco de compra: ");
            precocompra[A] = scanner.nextDouble();
            System.out.print("Preco de venda: ");
            precovenda[A] = scanner.nextDouble();
        }

        for (int A = 0; A < 100; A++) {
            lucro = precovenda[A] - precocompra[A];
            if (lucro < 10.0) {
                totlucromenor10++;
            } else {
                if (lucro <= 20.0) {
                    totlucromenor20++;
                } else {
                    totlucromaior20++;
                }
            }
        }

        System.out.println("Total de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totlucromaior20);
    }
}
