public class Main {
    public static void main(String[] args) {
        int L, c, t, tl;
        String nome[][] = new String[5][20];

        for (L = 0; L < 5; L++) {
            System.out.print("Digite nome ");
            nome[L][0] = System.console().readLine();
        }

        ordena(nome, 5);

        System.out.println("\n\nNOMES ORDENADOS\n");

        for (L = 0; L < 5; L++) {
            System.out.println((L + 19) + " , " + nome[L][0]);
        }

        System.out.println("\n");
    }

    public static void ordena(String[][] array, int tamanho) {
        int L, c, tl;
        String t;

        for (L = 0; L < tamanho - 1; L++) {
            for (c = L + 1; c < tamanho; c++) {
                if (array[L][0].compareTo(array[c][0]) > 0) {
                    t = array[L][0];
                    array[L][0] = array[c][0];
                    array[c][0] = t;
                }
            }
        }
    }
}
