import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c;
        int x;
        System.out.println("Digite letra : U ");
        c = scanner.nextLine();
        x = maiuscula(c);
        if (x == 1) {
            System.out.println("\ne uma consoante");
        } else {
            System.out.println("\nnao e uma consoante");
        }
        scanner.close();
    }

    public static int maiuscula(String c) {
        char letra = c.charAt(0);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            return 0;
        } else {
            return 1;
        }
    }
}
