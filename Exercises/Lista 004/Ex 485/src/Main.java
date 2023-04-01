import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int L,c;
        int[] num = new int[6];
        String[] num1 = new String[6];
        Scanner input = new Scanner(System.in);

        for (L = 0; L < 6; L++) {
            System.out.print("Digite numero: " + (L+1) + ": ");
            num[L] = input.nextInt();
        }

        for (L = 0; L < 6; L++) {
            System.out.print("Digite caractere: " + (L+1) + ": ");
            num1[L] = input.next();
        }

        System.out.println();

        multivetor(num, num1, 6);

        System.out.println();
    }

    public static void multivetor(int[] num, String[] num1, int len) {
    }
}
