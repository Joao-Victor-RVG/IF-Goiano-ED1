import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c;
        double num;
        Scanner sc = new Scanner(System.in);

        for(c = 1; c <= 5; c++){
            System.out.println("numero");
            num = sc.nextDouble();
            System.out.println("Quadrado:" + (Math.pow(num, 2)));
        }
        System.out.println("Fim");
    }
}
