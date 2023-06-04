import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class PostoSaudeAtendimento {
    public static void main(String[] args) {
        Deque<Pessoa> filaAtendimento = new ArrayDeque<>();
        Deque<Pessoa> naoAtendidos = new ArrayDeque<>();
        Random random = new Random();


        for (int grupo = 1; grupo <= 10; grupo++) {
            int necessidadesEspeciais = 1;
            int gestantes = 1;
            int lactantes = 1;
            int acimaDe60 = 3;
            int normal = 4;

            for (int i = 1; i <= grupo; i++) {
                int idade = random.nextInt(100) + 1;
                boolean gestante = false;
                boolean lactante = false;
                boolean necessidadeEspecial = false;


                if (necessidadesEspeciais > 0) {
                    necessidadeEspecial = true;
                    necessidadesEspeciais--;
                } else if (gestantes > 0) {
                    gestante = true;
                    gestantes--;
                } else if (lactantes > 0) {
                    lactante = true;
                    lactantes--;
                } else if (acimaDe60 > 0) {
                    acimaDe60--;
                } else if (normal > 0) {
                    normal--;
                }

                Pessoa pessoa = new Pessoa(i, idade, gestante, lactante, necessidadeEspecial);


                if (pessoa.getPrioridade() > 0) {
                    filaAtendimento.addFirst(pessoa);
                } else {
                    filaAtendimento.addLast(pessoa);
                }
            }
        }


        int atendidos = 0;
        while (!filaAtendimento.isEmpty() && atendidos < 100) {
            Pessoa pessoa = filaAtendimento.pollFirst();
            System.out.println("Pessoa " + pessoa.getId() + " foi atendida.");
            atendidos++;
        }


        naoAtendidos.addAll(filaAtendimento);

        System.out.println("\nTotal de pessoas atendidas: " + atendidos);
        System.out.println("Pessoas que não foram atendidas: " + naoAtendidos.size());
        System.out.println("IDs das pessoas que não foram atendidas: ");
        for (Pessoa pessoa : naoAtendidos) {
            System.out.println(pessoa.getId());
        }
    }
}
