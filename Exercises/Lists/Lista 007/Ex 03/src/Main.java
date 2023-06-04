//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Aeroporto {
//    private Queue<Aviao> filaDecolagem;
//
//    public Aeroporto() {
//        this.filaDecolagem = new LinkedList<>();
//    }
//
//    public void adicionarAviao(Aviao aviao) {
//        this.filaDecolagem.add(aviao);
//        System.out.println("Avião " + aviao.getNumero() + " adicionado à fila de decolagem.");
//    }
//
//    public void listarAvioes() {
//        int tamanhoFila = this.filaDecolagem.size();
//        if (tamanhoFila == 0) {
//            System.out.println("Não há aviões na fila de decolagem.");
//        } else {
//            System.out.println("Existem " + tamanhoFila + " aviões na fila de decolagem.");
//            for (Aviao aviao : filaDecolagem) {
//                System.out.println("Avião " + aviao.getNumero() + " aguardando na fila de decolagem.");
//            }
//        }
//    }
//
//    public void autorizarDecolagem() {
//        Aviao aviao = this.filaDecolagem.poll();
//        if (aviao == null) {
//            System.out.println("Não há aviões na fila de decolagem para autorizar decolagem.");
//        } else {
//            System.out.println("Autorizada decolagem do avião " + aviao.getNumero() + ".");
//        }
//    }
//}
//
//public class Aviao {
//    private int numero;
//
//    public Aviao(int numero) {
//        this.numero = numero;
//    }
//
//    public int getNumero() {
//        return this.numero;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Aeroporto aeroporto = new Aeroporto();
//        aeroporto.adicionarAviao(new Aviao(1));
//        aeroporto.adicionarAviao(new Aviao(2));
//        aeroporto.adicionarAviao(new Aviao(3));
//        aeroporto.listarAvioes();
//        aeroporto.autorizarDecolagem();
//        aeroporto.listarAvioes();
//        aeroporto.autorizarDecolagem();
//        aeroporto.autorizarDecolagem();
//        aeroporto.listarAvioes();
//        aeroporto.autorizarDecolagem();
//    }
//}
