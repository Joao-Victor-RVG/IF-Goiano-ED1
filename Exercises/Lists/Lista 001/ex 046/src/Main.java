import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite o saldo:");
        double saldo = input.nextDouble();


        double reajuste = saldo * 0.01;
        double novoSaldo = saldo + reajuste;


        System.out.println("Novo saldo: " + novoSaldo);

        input.close();
    }
}
