import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Queue<Integer> inverterFila(Queue<Integer> filaOriginal) {
        Queue<Integer> filaInvertida = new LinkedList<Integer>();
        while (!filaOriginal.isEmpty()) {
            filaInvertida.add(filaOriginal.remove());
        }
        return filaInvertida;
    }

    public static void main(String[] args) {
        Queue<Integer> filaOriginal = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++) {
            filaOriginal.add((int) (Math.random() * 100)); // gerando números aleatórios de 0 a 99
        }
        System.out.println("Fila original: " + filaOriginal);
        Queue<Integer> filaInvertida = inverterFila(filaOriginal);
        System.out.println("Fila invertida: " + filaInvertida);
    }
}
