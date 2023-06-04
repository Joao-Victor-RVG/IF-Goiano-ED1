
public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        head = new Node(0); // Nó cabeça
        head.next = head; // Aponta para si mesmo para indicar lista vazia
    }

    public boolean isEmpty() {
        return head.next == head;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        Node current = head.next;
        while (current != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


