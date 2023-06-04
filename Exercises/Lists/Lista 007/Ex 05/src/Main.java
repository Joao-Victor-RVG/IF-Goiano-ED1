import java.util.*;

public class Main {

    public static void main(String[] args) {


        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();


        for (int i = 0; i < 1000; i++) {
            int num = (int) (Math.random() * 1000) + 1;

            if (fila.contains(num)) {
                pilha.push(num);
            } else {
                fila.add(num);
            }
        }

        System.out.println("Fila F:");
        for (int num : fila) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Pilha P:");
        while (!pilha.isEmpty()) {
            int num = pilha.pop();
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
