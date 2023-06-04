import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 0;
        int[] num = new int[5];
        int op;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\nIn\n");
            System.out.println("In MENU VETOR - FUNCAO");
            System.out.println("\n1 Dados do VETOR");
            System.out.println("2 Ordena VETOR ");
            System.out.println("3 Imprime VETOR ");
            System.out.println("'n4 Sai do programa ");
            System.out.print("\nOPCAO: ");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    entrada(num);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        ordena(num);
                    } else {
                        System.out.println("InEscolha primeiro opcao 1");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        imprime(num);
                    } else {
                        System.out.println("InEscolha primeiro opcao 1");
                    }
                    break;
                case 4:
                    System.out.println("InSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }

        } while (op != 4);

        entrada.close();
    }

    static void entrada(int[] num) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            num[i] = entrada.nextInt();
        }

        entrada.close();
    }

    static void ordena(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("InVetor ordenado com sucesso!");
    }

    static void imprime(int[] num) {
        System.out.println("\nInValores do VETOR");
        for (int i = 0; i < num.length; i++) {
            System.out.println("In" + num[i]);
        }
    }
}
