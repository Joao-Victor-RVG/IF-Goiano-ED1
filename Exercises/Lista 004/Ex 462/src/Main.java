import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Digite nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Digite nota 3: ");
        nota3 = input.nextDouble();

        media = calcularMedia(nota1, nota2, nota3);

        System.out.println("Media aritmetica e " + media);

        System.out.println("Media armazenada em variavel = " + media);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
