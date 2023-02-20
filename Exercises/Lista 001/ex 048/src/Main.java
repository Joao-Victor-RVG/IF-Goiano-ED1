import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo, kwGasto, valorKw, valorPago, novoValorPago;

        System.out.print("Entre com o salario minimo ");
        salarioMinimo = sc.nextDouble();

        System.out.print("Entre com a quantidade em quilowatt ");
        kwGasto = sc.nextDouble();

        valorKw = salarioMinimo / 7 / 100;
        valorPago = kwGasto * valorKw;
        novoValorPago = valorPago * 0.9;

        System.out.println("Preço do quilowatt" + valorKw + "Valor a ser pago: " + valorPago + "Valor com desconto" + novoValorPago);

        sc.close();
    }
}
