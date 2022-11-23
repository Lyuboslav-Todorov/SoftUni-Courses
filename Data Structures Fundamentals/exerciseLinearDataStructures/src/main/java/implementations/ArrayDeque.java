package implementations;

import interfaces.Deque;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {

    private final int DEFAULT_CAPACITY = 3;
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
    public void add(E Element) {

    }

    @Override
    public void offer(E element) {

    }

    @Override
    public void addFirst(E element) {
    }

    @Override
    public void addLast(E element) {
        if (this.tail == elements.length){
            this.elements = grow();
        }
        this.elements[this.tail++] = element;
        size++;
    }

    @Override
    public void push(E element) {

    }

    @Override
    public void insert(int index, E element) {

    }

    @Override
    public void set(int index, E element) {

    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
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
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public void trimToSize() {

    }

    @Override
    public boolean isEmpty() {
        return false;
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

        for (int i = begin / 2 + 1; index < this.tail; i++) {
            grownElements[i] = elements[index++];
        }
        return grownElements;
    }
}
