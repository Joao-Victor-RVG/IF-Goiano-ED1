import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Aluno A =  new Aluno("Guilherme",18, "BCC");
        Aluno B =  new Aluno("João", 17, "Doideira");
        Aluno C =  new Aluno("Ma", 12, "Maluquete");
        Aluno D =  new Aluno("Raaa", 19, "Ruuu");
        Aluno E =  new Aluno("Reee", 12, "RIiii");
        Aluno resp = new Aluno();
        Fila fila = new Fila();
        fila.insere(A);
        fila.insere(E);
        fila.insere(B);
        fila.remove();
        fila.insere(D);
        fila.remove();
        fila.insere(C);
        fila.remove();
        fila.remove();
        fila.remove();
        if(fila.filaVazia()){
            System.out.println("Fila vazia!");
        } else{
            resp = fila.remove();
            System.out.println("O nome do aluno é: " + resp.nome);
            System.out.println("A matricula do aluno é: " + resp.matricula);
            System.out.println("O curso do aluno é: " + resp.curso);
            System.out.println("-----------------------------------");
        }
    }
}