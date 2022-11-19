package implementations;

import interfaces.AbstractQueue;

import java.util.Iterator;

public class Queue<E> implements AbstractQueue<E> {

    private Node<E> head;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public Queue() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void offer(E element) {
        Node<E> newNode = new Node<>(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<E> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    @Override
    public E poll() {
        ensureIsNotEmpty();
        E removedElement = this.head.element;
        if (this.size == 1) {
            this.head = null;
        } else {
            Node<E> newNode = this.head.next;
            this.head.next = null;
            this.head = newNode;
        }
        size--;
        return removedElement;
    }

    @Override
    public E peek() {
        ensureIsNotEmpty();
        return this.head.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size < 1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                ensureIsNotEmpty();
                return head != null;
            }

            @Override
            public E next() {
                E element = head.element;
                head = head.next;
                return element;
            }
        };
    }

    private void ensureIsNotEmpty() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
    }
}
