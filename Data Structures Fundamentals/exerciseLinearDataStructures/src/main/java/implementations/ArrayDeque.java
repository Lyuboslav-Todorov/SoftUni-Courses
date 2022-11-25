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
            if (this.tail == this.elements.length - 1) {
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
        ensureIndex(index);
        if (this.head == 0 || this.tail == this.elements.length - 1) {
            this.elements = grow();
        }
        int realIndex = index + this.head;
        if (realIndex - this.head < this.tail - realIndex) {
            shiftLeftAndInsert(element, realIndex);
        } else {
            shiftRightAndInsert(element, realIndex);
        }
    }

    @Override
    public void set(int index, E element) {
        ensureIndex(index);
        this.elements[this.head + index] = element;
    }

    @Override
    public E peek() {
        if (!isEmpty()) {
            return getAt(this.head);
        }
        return null;
    }

    @Override
    public E poll() {
        return removeFirst();
    }

    @Override
    public E pop() {
        return removeLast();
    }

    @Override
    public E get(int index) {
        ensureIndex(index);
        return getAt(this.head + index);
    }

    @Override
    public E get(Object object) {
        for (int i = this.head; i <= this.tail; i++) {
            if (this.elements[i].equals(object)) {
                return getAt(i);
            }
        }
        return null;
    }

    @Override
    public E remove(int index) {
        ensureIndex(index);
        int indexToRemove = this.head + index;
        E removedElement = getAt(indexToRemove);
        shiftAfterRemoval(indexToRemove);
        return removedElement;
    }

    @Override
    public E remove(Object object) {
        for (int i = this.head; i <= this.tail; i++) {
            if (this.elements[i].equals(object)) {
                remove(i - this.head);
            }
        }
        return null;
    }

    @Override
    public E removeFirst() {
        if (!isEmpty()) {
            E element = getAt(this.head);
            this.elements[this.head++] = null;
            this.size--;
            return element;
        }
        return null;
    }

    @Override
    public E removeLast() {
        if (!isEmpty()) {
            E element = getAt(this.tail);
            this.elements[this.tail--] = null;
            size--;
            return element;
        }
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
        //TODO
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = head;

            @Override
            public boolean hasNext() {
                return index <= tail;
            }

            @Override
            public E next() {
                return getAt(index++);
            }
        };
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

    @SuppressWarnings("unchecked")
    private E getAt(int index) {
        return (E) this.elements[index];
    }


    private void ensureIndex(int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException("Index out of bound for index:" + index);
        }
    }

    private void shiftAfterRemoval(int indexToRemove) {
        for (int i = indexToRemove; i <= this.tail; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.tail--;
        this.size--;
    }

    private void shiftRightAndInsert(E element, int realIndex) {
        for (int i = this.tail; i >= realIndex; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[realIndex] = element;
        this.tail++;
    }

    private void shiftLeftAndInsert(E element, int realIndex) {
        for (int i = this.head; i <= realIndex; i++) {
            this.elements[i - 1] = this.elements[i];
        }
        this.elements[realIndex] = element;
        this.head--;
    }
}
