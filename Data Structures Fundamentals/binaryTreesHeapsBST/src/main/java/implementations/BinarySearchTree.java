package implementations;

import interfaces.AbstractBinarySearchTree;

public class BinarySearchTree<E extends Comparable<E>> implements AbstractBinarySearchTree<E> {
    private Node<E> root;

    public BinarySearchTree() {
    }

    private BinarySearchTree(Node<E> node) {
        this.copy(node);
    }

    private void copy(Node<E> node) {
        if (node == null) {
            return;
        }
        this.insert(node.value);
        this.copy(node.leftChild);
        this.copy(node.rightChild);
    }

    @Override
    public void insert(E element) {
        Node<E> newNode = new Node<>(element);
        if (getRoot() == null) {
            this.root = newNode;
        } else {
            Node<E> parent = this.root;
            while (parent.leftChild != null && parent.rightChild != null) {
                if (parent.value.compareTo(element) > 0) {
                    parent = parent.leftChild;
                } else if (parent.value.compareTo(element) < 0) {
                    parent = parent.rightChild;
                } else {
                    return;
                }
            }
            if (parent.value.compareTo(element) > 0) {
                parent.leftChild = newNode;
            } else if (parent.value.compareTo(element) < 0) {
                parent.rightChild = newNode;
            }

        }

    }

    @Override
    public boolean contains(E element) {
        Node<E> current = this.root;

        while (current.value != null) {
            if (current.value.compareTo(element) > 0) {
                current = current.leftChild;
            } else if (current.value.compareTo(element) < 0) {
                current = current.rightChild;
            } else {
                return true;
            }
        }

        return false;
    }

    @Override
    public AbstractBinarySearchTree<E> search(E element) {
        AbstractBinarySearchTree<E> result = new BinarySearchTree<>();
        Node<E> current = this.root;

        while (current.value != null) {
            if (current.value.compareTo(element) > 0) {
                current = current.leftChild;
            } else if (current.value.compareTo(element) < 0) {
                current = current.rightChild;
            } else {
                return new BinarySearchTree<>(current);
            }
        }

        return result;
    }

    @Override
    public Node<E> getRoot() {
        return this.root;
    }

    @Override
    public Node<E> getLeft() {
        return this.root.leftChild;
    }

    @Override
    public Node<E> getRight() {
        return this.root.rightChild;
    }

    @Override
    public E getValue() {
        return this.root.value;
    }
}
