package implementations;

import interfaces.AbstractQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {

    List<E> elements;

    public PriorityQueue() {
        this.elements = new ArrayList<>();
    }


    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public void add(E element) {
        this.elements.add(element);
        heapifyUp(this.size() - 1);
    }

    private void heapifyUp(int index) {
        while (hasParent(index) && isLess(parent(index), this.elements.get(index))) {
            int parentIndex = getParentIndex(index);
            Collections.swap(this.elements, parentIndex, index);
            index = parentIndex;
        }
    }

    private int getParentIndex(int index) {
        return (index -1) / 2;
    }

    private boolean isLess(E first, E second) {
        return first.compareTo(second) < 0;
    }

    private E parent(int index) {
        return this.elements.get((index -1) / 2);
    }

    private boolean hasParent(int index) {
        return (index - 1) / 2 >= 0;
    }

    @Override
    public E peek() {
        ensureNonEmpty();
        return this.elements.get(0);
    }

    private void ensureNonEmpty() {
        if (this.size() == 0) {
            throw new IllegalStateException("Heap is empty");
        }
    }

    @Override
    public E poll() {
        ensureNonEmpty();
        E elementToReturn = this.elements.get(0);
        Collections.swap(this.elements, 0, this.elements.size() - 1);
        this.elements.remove(this.elements.size() - 1);
        this.heapifyDown(0);
        return elementToReturn;
    }

    private void heapifyDown(int index) {
        while (index < this.elements.size() / 2) {
            int childIndex = index * 2 + 1;

            if (childIndex + 1 < this.elements.size() && isLess(this.elements.get(childIndex), this.elements.get(childIndex + 1))) {
                childIndex = childIndex + 1;
            }

            if (isLess(this.elements.get(childIndex), this.elements.get(index))) {
                break;
            }

            Collections.swap(this.elements, childIndex, index);
            index = childIndex;
        }
    }


}
