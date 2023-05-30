public class Pessoa {
    private int id;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;

    public Pessoa(int id, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isGestante() {
        return gestante;
    }

    public boolean isLactante() {
        return lactante;
    }

    public boolean isNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public int getPrioridade() {
        if (idade >= 60) {
            return 1;
        } else if (necessidadeEspecial) {
            return 2;
        } else if (gestante || lactante) {
            return 3;
        } else {
            return 0;
        }
    }
}
