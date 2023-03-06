import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] ultimosDiasDoMes = new int[12];
        String[] signosDoZodiaco = new String[12];
        int data, dia, mes;
        Scanner input = new Scanner(System.in);

        // Coletar informações sobre os signos do zodíaco
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o nome do signo: ");
            signosDoZodiaco[i] = input.nextLine();
            System.out.println("Digite o último dia do mês correspondente: ");
            ultimosDiasDoMes[i] = Integer.parseInt(input.nextLine());
        }

        // Ler as datas e calcular o signo do zodíaco correspondente
        System.out.println("Digite a data no formato ddmm ou 9999 para terminar: ");
        data = Integer.parseInt(input.nextLine());

        while (data != 9999) {
            try {
                dia = data / 100;
                mes = data % 100 - 1;

                if (dia > ultimosDiasDoMes[mes]) {
                    mes = (mes + 1) % 12;
                }

                System.out.println("Signo do zodíaco: " + signosDoZodiaco[mes] + "\n");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Data inválida. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.");
            }

            System.out.println("Digite a data no formato ddmm ou 9999 para terminar: ");
            data = Integer.parseInt(input.nextLine());
        }

        input.close();
    }

}
