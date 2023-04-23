import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a chave do item a ser removido: ");
        int chave = sc.nextInt();

        Stack<Integer> novaPilha = new Stack<>();
        while (!pilha.isEmpty()) {
            int item = pilha.pop();
            if (item != chave) {
                novaPilha.push(item);
            }
        }

        while (!novaPilha.isEmpty()) {
            pilha.push(novaPilha.pop());
        }

        System.out.println("Pilha resultante: " + pilha);
    }
}
