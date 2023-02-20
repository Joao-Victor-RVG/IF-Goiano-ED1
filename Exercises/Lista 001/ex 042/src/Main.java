import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ângulo em graus: ");
        double angulo = sc.nextDouble();

        double radiano = Math.toRadians(angulo);
        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);
        double secante = 1 / Math.cos(radiano);
        double cosecante = 1 / Math.sin(radiano);
        double cotangente = 1 / Math.tan(radiano);

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Co-secante: " + cosecante);
        System.out.println("Co-tangente: " + cotangente);

    }
}