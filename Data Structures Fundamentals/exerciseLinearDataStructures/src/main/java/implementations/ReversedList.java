package implementations;

import interfaces.Reversed;

import java.util.Iterator;

public class ReversedList<E> implements Reversed<E> {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] elements;
    private int size;

    public ReversedList(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(E element) {
        if (this.elements.length == this.size){
            this.elements = grow();
        }
        this.elements[this.elements.length - this.size - 1] = element;
        size++;
    }

    private Object[] grow() {
        Object[] newElements = new Object[this.size * 2];
        int index = newElements.length - 1;
        for (int i = this.elements.length - 1; i >= 0; i--) {
            newElements[index--] = this.elements[i];
        }
        return newElements;
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
    public E get(int index) {
        int realIndex = getRealIndex(index);
        return (E) this.elements[realIndex];
    }

    @Override
    public E removeAt(int index) {
        int realIndex = getRealIndex(index);
        E element = (E) this.elements[realIndex];
        for (int i = realIndex; i > 0; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        size--;
        return element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = elements.length - size;
            @Override
            public boolean hasNext() {
                return index != elements.length;
            }

            @Override
            public E next() {
                return (E) elements[index++];
            }
        };
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    private int getRealIndex(int index) {
        ensureIndex(index);
        return this.elements.length - size + index;
    }
}
