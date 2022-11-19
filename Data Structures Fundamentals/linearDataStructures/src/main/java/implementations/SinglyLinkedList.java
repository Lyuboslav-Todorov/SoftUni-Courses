package implementations;

import interfaces.LinkedList;

import java.util.Iterator;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node<E> head;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;

        private Node(E element) {
            this.element = element;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E element) {
        Node<E> nodeToAddFirst = new Node<>(element);
        if (this.head != null) {
            this.head.previous = nodeToAddFirst;
        }
        nodeToAddFirst.next = this.head;
        this.head = nodeToAddFirst;
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> nodeToAddLast = new Node<>(element);
        if (this.head != null) {
            Node<E> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nodeToAddLast;
            nodeToAddLast.previous = current;
        } else {
            this.head = nodeToAddLast;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        ensureIsNotEmpty();
        E removedElement = this.head.element;
        Node<E> newHead = this.head.next;
        this.head.next = null;
        this.head = newHead;
        size--;
        return removedElement;
    }

    @Override
    public E removeLast() {
        ensureIsNotEmpty();
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.previous.next = null;
        current.previous = null;
        return current.element;
    }

    @Override
    public E getFirst() {
        ensureIsNotEmpty();
        return this.head.element;
    }

    @Override
    public E getLast() {
        ensureIsNotEmpty();
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private void ensureIsNotEmpty() {
        if (isEmpty()) {
            throw new IllegalStateException("Is empty!");
        }
    }
}
