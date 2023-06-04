public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(4);
        list.insertLast(5);

        System.out.println("Lista: ");
        printList(list);

        System.out.println("O elemento 3 está na lista? " + list.search(3));
        System.out.println("O elemento 6 está na lista? " + list.search(6));

        list.removeFirst();
        list.removeLast();

        System.out.println("Lista após a remoção do primeiro e último elementos: ");
        printList(list);
    }

    public static void printList(DoublyLinkedList list) {
        DoublyLinkedList.Node current = list.head.next;

        while (current != list.head) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
