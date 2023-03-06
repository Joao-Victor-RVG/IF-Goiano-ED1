import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int op, x, tam;

        do {
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            if(op == 1) {
                System.out.print("Digite uma frase: ");
                frase = scanner.next();
                System.out.println("numero de caracteres da frase: " + frase.length());
            } else if(op == 2) {
                System.out.print("Digite uma frase: ");
                frase = scanner.next();
                System.out.println("os dois primeiros caracteres: " + frase.substring(0, 2));
                tam = frase.length() - 2;
                System.out.println("os dois ultimos caracteres: " + frase.substring(tam));
            } else if(op == 3) {
                System.out.print("Digite uma frase: ");
                frase = scanner.next();
                for(x = frase.length() - 1; x >= 0; x--) {
                    System.out.print(frase.charAt(x));
                }
            } else if(op == 4) {
                System.out.println("Fim do algoritmo");
            } else {
                System.out.println("opção nao disponivel");
            }

            System.out.println();
        } while(op != 4);
    }
}