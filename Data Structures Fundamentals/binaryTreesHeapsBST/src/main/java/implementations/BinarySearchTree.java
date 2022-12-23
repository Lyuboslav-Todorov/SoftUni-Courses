package implementations;

import interfaces.AbstractBinarySearchTree;

public class BinarySearchTree<E extends Comparable<E>> implements AbstractBinarySearchTree<E> {
    private Node<E> root;
    private Node<E> leftChild;
    private Node<E> rightChild;

    @Override
    public void insert(E element) {
        Node<E> newNode = new Node<>(element);
        if (getRoot() == null){
            this.root = newNode;
        } else {
            Node<E> current = this.root;
            Node<E> parent;
            while (current != null){
                parent = current;
                if (current.value.compareTo(element) > 0) {
                    current = parent.leftChild;
                } else if (current.value.compareTo(element) < 0) {
                    current = parent.rightChild;
                } else {
                    return;
                }
            }
        }

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public AbstractBinarySearchTree<E> search(E element) {
        return null;
    }

    @Override
    public Node<E> getRoot() {
        return this.root;
    }

    @Override
    public Node<E> getLeft() {
        return this.leftChild;
    }

    @Override
    public Node<E> getRight() {
        return this.rightChild;
    }

    @Override
    public E getValue() {
        return this.root.value;
    }
}
