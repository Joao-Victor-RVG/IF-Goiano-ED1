public class DoublyLinkedList {
    Node head;


    public DoublyLinkedList() {
        head = new Node();
        head.next = head;
        head.prev = head;
    }


    public class Node {
        int data;
        Node next;
        Node prev;
    }


    public boolean isEmpty() {
        return head.next == head;
    }


    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }


    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
    }


    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("A lista está vazia. Não é possível remover.");
            return;
        }

        Node firstNode = head.next;
        head.next = firstNode.next;
        firstNode.next.prev = head;
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("A lista está vazia. Não é possível remover.");
            return;
        }

        Node lastNode = head.prev;
        head.prev = lastNode.prev;
        lastNode.prev.next = head;
    }


    public boolean search(int data) {
        Node current = head.next;

        while (current != head) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }

        return false;
    }
}
