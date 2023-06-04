public class DoublyLinkedListCircular<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    public int countElements() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node<T> current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    public void insertLeft(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void concatenateLists(DoublyLinkedListCircular<T> list) {
        if (list.head == null) {
            return;
        }

        if (head == null) {
            head = list.head;
        } else {
            Node<T> tail = head.prev;
            tail.next = list.head;
            list.head.prev = tail;
            head.prev = list.head.prev;
            list.head.prev.next = head;
        }
        size += list.size;
    }

    public void mergeOrderedLists(DoublyLinkedListCircular<T> list) {
        if (list.head == null) {
            return;
        }

        if (head == null) {
            head = list.head;
        } else {
            Node<T> currentA = head;
            Node<T> currentB = list.head;

            while (currentA.next != head && currentB != list.head) {
                if (((Comparable<T>) currentB.data).compareTo(currentA.data) < 0) {
                    Node<T> newNode = new Node<>(currentB.data);
                    newNode.prev = currentA.prev;
                    newNode.next = currentA;
                    currentA.prev.next = newNode;
                    currentA.prev = newNode;
                    currentB = currentB.next;
                    size++;
                } else {
                    currentA = currentA.next;
                }
            }

            if (currentA.next == head) {
                while (currentB != list.head) {
                    Node<T> newNode = new Node<>(currentB.data);
                    newNode.prev = currentA;
                    newNode.next = head;
                    currentA.next = newNode;
                    head.prev = newNode;
                    currentA = newNode;
                    currentB = currentB.next;
                    size++;
                }
            }
        }
    }

    public DoublyLinkedListCircular<T> copyList() {
        DoublyLinkedListCircular<T> newList = new DoublyLinkedListCircular<>();
        if (head == null) {
            return newList;
        }

        Node<T> current = head;
        do {
            newList.insertLeft(current.data);
            current = current.next;
        } while (current != head);

        return newList;
    }
}
