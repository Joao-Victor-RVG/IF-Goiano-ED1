import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, c;
        Scanner input = new Scanner(System.in);

        for (c = 0; c < 3; c++) {
            System.out.println("\n\ndigite numero: ");
            a = input.nextInt();
            System.out.println("dobro: " + dob(a));
        }

        System.out.println("\n");
    }

    public static int dob(int num) {
        return num * 2;

    }
}