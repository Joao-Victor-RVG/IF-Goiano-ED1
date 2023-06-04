import random

class Node:
    def __init__(self, data=None):
        self.data = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_sorted(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            self.tail = new_node
        elif data <= self.head.data:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node
        elif data >= self.tail.data:
            new_node.prev = self.tail
            self.tail.next = new_node
            self.tail = new_node
        else:
            current = self.head.next
            while current.data < data:
                current = current.next

            new_node.next = current
            new_node.prev = current.prev
            current.prev.next = new_node
            current.prev = new_node

    def remove_primes(self):
        current = self.head
        while current is not None:
            next_node = current.next
            if self.is_prime(current.data):
                self.remove_node(current)
            current = next_node

    def remove_node(self, node):
        if node.prev is None:
            self.head = node.next
        else:
            node.prev.next = node.next

        if node.next is None:
            self.tail = node.prev
        else:
            node.next.prev = node.prev

    def is_prime(self, num):
        if num < 2:
            return False
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True

    def print_forward(self):
        current = self.head
        while current is not None:
            print(current.data, end=' ')
            current = current.next
        print()

    def print_backward(self):
        current = self.tail
        while current is not None:
            print(current.data, end=' ')
            current = current.prev
        print()


random_numbers = random.sample(range(-9999, 9999), 1000)


vector = random_numbers


doubly_linked_list = DoublyLinkedList()
for num in vector:
    doubly_linked_list.insert_sorted(num)


print("Lista em ordem crescente:")
doubly_linked_list.print_forward()


print("Lista em ordem decrescente:")
doubly_linked_list.print_backward()


doubly_linked_list.remove_primes()


print("Lista após remover números primos:")
doubly_linked_list.print_forward()

