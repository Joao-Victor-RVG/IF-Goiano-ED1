import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int n = 20; 
        int m = new Random().nextInt(n) + 1;


        List<Pessoa> roda = new ArrayList<Pessoa>();
        for (int i = 1; i <= n; i++) {
            roda.add(new Pessoa("Pessoa " + i, "Telefone " + i, "Endereço " + i, "CPF " + i));
        }
        for (int i = 0; i < n; i++) {
            roda.get(i).setProximo(roda.get((i+1)%n));
        }


        Pessoa atual = roda.get(0);
        while (roda.size() > 1) {
            for (int i = 1; i < m; i++) {
                atual = atual.getProximo();
            }
            Pessoa eliminada = atual.getProximo();
            atual.setProximo(eliminada.getProximo());
            roda.remove(eliminada);
        }

        Pessoa sobrevivente = roda.get(0);
        System.out.println("A pessoa sobrevivente é " + sobrevivente.getNome() + " com CPF " + sobrevivente.getCPF());
    }
}

class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    private Pessoa proximo;

    public Pessoa(String nome, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCPF() {
        return cpf;
    }

    public Pessoa getProximo() {
        return proximo;
    }

    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }
}
