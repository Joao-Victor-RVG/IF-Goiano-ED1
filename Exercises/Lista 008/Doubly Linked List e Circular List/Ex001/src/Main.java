public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.add(3);
        list1.add(6);
        list1.add(9);
        list1.add(12);

        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.add(2);
        list2.add(4);
        list2.add(7);
        list2.add(10);

        System.out.println("Lista 1:");
        list1.display();

        System.out.println("Lista 2:");
        list2.display();

        DoublyLinkedList concatenatedList = DoublyLinkedList.concatenate(list1, list2);
        System.out.println("Lista concatenada:");
        concatenatedList.display();

        DoublyLinkedList list3 = new DoublyLinkedList();
        DoublyLinkedList list4 = new DoublyLinkedList();
        concatenatedList.split(list3, list4);
        System.out.println("Lista 3 após divisão:");
        list3.display();
        System.out.println("Lista 4 após divisão:");
        list4.display();

        DoublyLinkedList sortedList1 = new DoublyLinkedList();
        sortedList1.add(2);
        sortedList1.add(5);
        sortedList1.add(8);
        sortedList1.add(11);

        DoublyLinkedList sortedList2 = new DoublyLinkedList();
        sortedList2.add(1);
        sortedList2.add(3);
        sortedList2.add(6);
        sortedList2.add(9);

        DoublyLinkedList mergedList = DoublyLinkedList.mergeSortedLists(sortedList1, sortedList2);
        System.out.println("Lista mesclada ordenada:");
        mergedList.display();
    }
}