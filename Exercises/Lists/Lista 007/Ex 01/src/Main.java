import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequência de caracteres: ");
        String texto = scanner.nextLine().replaceAll("[\\s.]+", "").toLowerCase();
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            pilha.push(c);
        }

        System.out.print("Texto invertido: ");
        while (!pilha.isEmpty()) {
            char c = pilha.pop();
            System.out.print(c);
        }

        boolean palindromo = true;
        for (int i = 0; i < texto.length(); i++) {
            char c1 = texto.charAt(i);
            char c2 = pilha.pop();
            if (c1 != c2) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("\nO texto é um palíndromo.");
        } else {
            System.out.println("\nO texto não é um palíndromo.");
        }

        scanner.close();
    }
}
