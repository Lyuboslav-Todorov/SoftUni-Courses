package implementations;

import interfaces.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 4;
    private Object[] elements;
    private int size;

    public ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }
        this.elements[this.size++] = element;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        indexValidation(index);

        insert(index, element);

        return true;
    }

    private void insert(int index, E element) {
        if (this.size == elements.length) {
            this.elements = grow();
        }

        for (int i = this.size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }

        this.elements[index] = element;

        size++;
    }

    @Override
    public E get(int index) {
        indexValidation(index);

        return (E) this.elements[index];
    }

    @Override
    public E set(int index, E element) {
        indexValidation(index);

        E previousElement = this.get(index);

        this.elements[index] = element;

        return previousElement;
    }

    @Override
    public E remove(int index) {
        indexValidation(index);

        E removedElement = this.get(index);

        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        size--;

        ensureCapacity();

        return removedElement;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < size();
            }

            @Override
            public E next() {
                return get(index++);
            }
        };
    }

    private Object[] grow() {
        return Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    private void indexValidation(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Incorrect index (" + index + ") !");
        }
    }

    private void ensureCapacity() {
        if (this.size < this.elements.length / 3) {
            this.elements = shrink();
        }
    }

    private Object[] shrink() {
        return Arrays.copyOf(this.elements, this.elements.length / 2);
    }

}
