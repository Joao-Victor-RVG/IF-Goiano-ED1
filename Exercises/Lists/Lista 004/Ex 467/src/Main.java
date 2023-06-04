public class Main {
    public static void main(String[] args) {
        double z, L, b;
        int c;
        for (c = -1; c <= 3; c++) {
            System.out.print("Indigite logaritmando maior do que 0: ");
            L = new java.util.Scanner(System.in).nextDouble();
            while (L <= 0) {
                System.out.print("\nInvalido. Digite logaritmando maior do que 0: ");
                L = new java.util.Scanner(System.in).nextDouble();
            }
            System.out.print("Digite base maior que 0 e diferente de 1: ");
            b = new java.util.Scanner(System.in).nextDouble();
            while (b < 0 || b == 1) {
                System.out.print("\nInvalido. Digite base maior que 0 e diferente de 1: ");
                b = new java.util.Scanner(System.in).nextDouble();
            }
            System.out.print("\nLogaritmo e " + loga(L, b));
            z = loga(L, b);
            System.out.print("\nz = " + z);
        }
        System.out.print("\n");
    }

    public static double loga(double L, double b) {
        return Math.log(L) / Math.log(b);
    }
}
