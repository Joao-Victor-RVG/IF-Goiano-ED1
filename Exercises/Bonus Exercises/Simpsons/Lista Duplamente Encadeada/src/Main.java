public class Main {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.AdicionaNoComeco("Elemento 1");
        lista.AdicionaNoComeco("Elemento 2");
        lista.Adiciona("Elemento 3");

        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.println("Contém 'Elemento 1'? " + lista.Contem("Elemento 1"));
        System.out.println("Contém 'Elemento 4'? " + lista.Contem("Elemento 4"));

        System.out.println("Lista: " + lista.Imprimir());

        lista.RemovedoFim();

        System.out.println("Tamanho da lista após remover do fim: " + lista.tamanho());
        System.out.println("Lista após remover do fim: " + lista.Imprimir());
    }
}


