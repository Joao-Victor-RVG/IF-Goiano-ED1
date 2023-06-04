public class Main {
    public static void main(String[] args) {
        int L, c, aux;
        int[] num = new int[4];
        int[] num1 = new int[4];

        for(L = 0; L < 4; L++) {
            System.out.print("\n\nDigite 1 numero " + (L+1) + ": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }

        for(L = 0; L < 4; L++) {
            System.out.print("\n\nDigite 2 numero " + (L+1) + ": ");
            num1[L] = Integer.parseInt(System.console().readLine());
        }

        c = produtointerno(num, num1, 4);

        System.out.println("\nVETOR A\tVETOR B");
        for(L = 0; L < 4; L++) {
            System.out.println(num[L] + "\t" + num1[L]);
        }

        System.out.println("\n\nProduto interno: " + c);
    }

    public static int produtointerno(int[] num, int[] num1, int n) {
        int c = 0;
        for(int i = 0; i < n; i++) {
            c += num[i] * num1[i];
        }
        return c;
    }
}
