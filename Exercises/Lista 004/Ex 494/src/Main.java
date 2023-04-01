public class Main {
    public static void main(String[] args) {
        int L, c, t, tl;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];
        for (L = 0; L < 3; L++) {
            System.out.println("\nDigite nome: ");
            nome[L] = new java.util.Scanner(System.in).nextLine();
            System.out.println("\nDigite endereco: ");
            ender[L] = new java.util.Scanner(System.in).nextLine();
            System.out.println("Digite profissao: ");
            prof[L] = new java.util.Scanner(System.in).nextLine();
        }

        for (L = 0; L < 2; L++) {
            for (c = L + 1; c < 3; c++) {
                if (nome[L].compareTo(nome[c]) > 0) {
                    troca(nome, L, c);
                    troca(ender, L, c);
                    troca(prof, L, c);
                }
            }
        }

        for (L = 0; L < 3; L++) {
            System.out.println("Nome: " + nome[L] + " Endereco: " + ender[L] + " Profissao: " + prof[L]);
        }
    }

    public static void troca(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



