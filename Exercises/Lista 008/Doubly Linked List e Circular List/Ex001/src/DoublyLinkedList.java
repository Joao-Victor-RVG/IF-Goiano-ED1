public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        tail.next = head;
        head.previous = tail;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        Node current = head;
        System.out.print("Lista: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }


    public static DoublyLinkedList concatenate(DoublyLinkedList list1, DoublyLinkedList list2) {
        if (list1.isEmpty()) {
            return list2;
        } else if (list2.isEmpty()) {
            return list1;
        }

        DoublyLinkedList result = new DoublyLinkedList();

        Node current = list1.head;
        do {
            result.add(current.data);
            current = current.next;
        } while (current != list1.head);

        current = list2.head;
        do {
            result.add(current.data);
            current = current.next;
        } while (current != list2.head);

        return result;
    }


    public void split(DoublyLinkedList list1, DoublyLinkedList list2) {
        if (isEmpty() || head.next == head) {
            System.out.println("A lista não pode ser dividida.");
            return;
        }

        int size = getSize();
        int middle = size / 2;
        int count = 0;

        Node current = head;
        while (count < middle) {
            list1.add(current.data);
            current = current.next;
            count++;
        }

        while (count < size) {
            list2.add(current.data);
            current = current.next;
            count++;
        }
    }


    public static DoublyLinkedList mergeSortedLists(DoublyLinkedList list1, DoublyLinkedList list2) {
        if (list1.isEmpty()) {
            return list2;
        } else if (list2.isEmpty()) {
            return list1;
        }

        DoublyLinkedList result = new DoublyLinkedList();

        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                result.add(current1.data);
                current1 = current1.next;
            } else {
                result.add(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            result.add(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            result.add(current2.data);
            current2 = current2.next;
        }

        return result;
    }


    private int getSize() {
        int size = 0;
        Node current = head;
        do {
            size++;
            current = current.next;
        } while (current != head);
        return size;
    }
}
