import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        int numPositivos = 1000;
        int numNegativos = 1000;

        for (int i = 0; i < numPositivos; i++) {
            fila.add((int) (Math.random() * 1000));
        }
        for (int i = 0; i < numNegativos; i++) {
            fila.add((int) (Math.random() * -1000));
        }

        while (!fila.isEmpty()) {
            int numeroAtual = fila.poll();


            if (numeroAtual >= 0) {
                pilha.push(numeroAtual);
            } else {
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                }
            }
        }
    }
}
