import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ang, r;
        System.out.print("Digite um ângulo em graus: ");
        ang = scanner.nextDouble();
        r = Math.toRadians(ang);
        System.out.println("Ângulo em graus: " + ang + ", em radianos: " + r);
    }
}
