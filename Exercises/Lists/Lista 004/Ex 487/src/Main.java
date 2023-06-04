public class Main {
    public static void main(String[] args) {
        int L, n;
        int[] num = new int[10];
        for (L = 0; L < 10; L++) {
            System.out.print("Digite numero : " + (L + 1) + ": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        inverte(num, 10);
        System.out.println("\nVETOR\n");
        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }
        System.out.println();
    }

    public static void inverte(int[] num, int n) {
        int i, j, temp;
        for (i = 0, j = n - 1; i < j; i++, j--) {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }
}