import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o numero de discos da torre de hanoi a ser resolvida: ");
        Scanner input = new Scanner(System.in);
        int qtd = input.nextInt();

        long startTime = System.nanoTime(); // Início da medição do tempo de execução

        moveTower(qtd, "Torre1", "Torre2", "Torre3");

        long endTime = System.nanoTime(); // Fim da medição do tempo de execução
        long duration = (endTime - startTime) / 1000000; // Conversão de nanossegundos para milissegundos

        System.out.println("Tempo de execução: " + duration + " milissegundos");

        System.out.println("Terminou");

    }


    public static void moveTower(int height, String fromPole, String toPole, String withPole){
        if(height >= 1){
            moveTower(height - 1, fromPole, withPole, toPole);
            moveTower(height - 1, withPole, toPole, fromPole);
        }
        else return;
    }
}

