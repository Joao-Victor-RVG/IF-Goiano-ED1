import java.util.ArrayList;
import java.util.List;
public class Fila {
    List<Aluno> alunos = new ArrayList<>();
    //metodos do Fernandão
    void insere(Aluno A){
        alunos.add(A);
    }
    Aluno remove(){
        return this.alunos.remove(0);
    }
    boolean filaVazia(){
        return this.alunos.isEmpty();
    }




}