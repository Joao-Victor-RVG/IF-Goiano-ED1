import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ang, g;

        System.out.print("\ndigite angulo em radianos: ");
        ang = scanner.nextDouble();
        g = Math.toDegrees(ang);

        System.out.println("\nradianos: " + ang + " graus: " + g + "\n");
    }
}
