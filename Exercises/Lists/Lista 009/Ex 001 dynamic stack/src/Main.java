import java.util.Scanner;

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class DynamicStack {
    private Node top;

    public DynamicStack() {
        this.top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        String expressao = scanner.nextLine();

        if (verificarExpressao(expressao)) {
            System.out.println("Expressão correta");
        } else {
            System.out.println("Expressão incorreta");
        }
    }

    public static boolean verificarExpressao(String expressao) {
        DynamicStack pilha = new DynamicStack();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    char topo = pilha.pop();
                    if ((caractere == ')' && topo != '(') || (caractere == ']' && topo != '[') || (caractere == '}' && topo != '{')) {
                        return false;
                    }
                }
            }
        }

        return pilha.isEmpty();
    }
}
