package implementations;

import interfaces.Deque;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {

    private final int DEFAULT_CAPACITY = 7;
    private int head;
    private int tail;
    private int size;

    Object[] elements;

    public ArrayDeque() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.head = elements.length / 2;
        this.tail = this.head;
    }

    @Override
    public void add(E element) {
        addLast(element);
    }

    @Override
    public void offer(E element) {
        addLast(element);
    }

    @Override
    public void addFirst(E element) {
        if (this.size == 0) {
            this.elements[this.head] = element;
        } else {
            if (this.head == 0) {
                this.elements = grow();
            }

            this.elements[--this.head] = element;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        if (this.size == 0) {
            this.elements[this.tail] = element;
        } else {
            if (this.tail == 0) {
                this.elements = grow();
            }
            this.elements[++this.tail] = element;
        }
        size++;
    }

    @Override
    public void push(E element) {
        addFirst(element);
    }

    @Override
    public void insert(int index, E element) {

    }

    @Override
    public void set(int index, E element) {

    }

    @Override
    public E peek() {
        if (this.size > 0) {
            return getAt(this.head);
        }
        return null;
    }

    @Override
    public E poll() {
        if (!isEmpty()) {
            E element = getAt(this.head);
            this.elements[this.head++] = null;
            this.size--;
            return element;
        }
        return null;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            E element = getAt(this.tail);
            this.elements[this.tail--] = null;
            size--;
            return element;
        }
        return null;
    }

    @Override
    public E get(int index) {
        ensureIndex(index);

        return getAt(this.head + index);
    }

    @Override
    public E get(Object object) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E remove(Object object) {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int capacity() {
        return this.elements.length;
    }

    @Override
    public void trimToSize() {

    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private Object[] grow() {
        Object[] grownElements = new Object[this.elements.length * 2 + 1];

        int middle = grownElements.length / 2;

        int begin = middle - this.size / 2;

        int index = this.head;

        for (int i = begin; index <= this.tail; i++) {
            grownElements[i] = this.elements[index++];
        }

        this.head = begin;

        this.tail = this.head + this.size - 1;

        return grownElements;
    }

    private E getAt(int index) {
        return (E) this.elements[index];
    }


    private void ensureIndex(int index) {
        if (index < 0 || index > this.size - 1){
            throw new IndexOutOfBoundsException("There is not such index!");
        }
    }
}
