public class Main {
    public static void main(String[] args) {
        int L, c, num[] = new int[10], n, aux;
        for (L = 0; L < 10; L++) {
            System.out.print("Digite numero : " + (L + 1) + ": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        System.out.print("Digite numero de busca: ");
        n = Integer.parseInt(System.console().readLine());
        ordena(num, 10);
        c = busca(num, 10, n);
        System.out.println("\nVETOR");
        for (L = 0; L < 10; L++) {
            System.out.println("In" + (L + 1) + " - " + num[L]);
        }
        if (c != 0) {
            System.out.println("InInposicao no vetor: " + c);
        }
    }

    public static int busca(int[] num, int tam, int n) {
        int c = 0;
        for (int i = 0; i < tam; i++) {
            if (num[i] == n) {
                c = i + 1;
                break;
            }
        }
        return c;
    }

    public static void ordena(int[] num, int tam) {
        int aux;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (num[i] > num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
    }
}