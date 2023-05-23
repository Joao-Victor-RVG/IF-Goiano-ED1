public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display(); // Saída: 30 20 10
    }
}