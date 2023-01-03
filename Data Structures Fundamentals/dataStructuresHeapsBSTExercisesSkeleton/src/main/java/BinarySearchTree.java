import java.util.function.Consumer;

import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;

    public static class Node<E> {
        private E value;
        private Node<E> leftChild;
        private Node<E> rightChild;

        public Node(E value) {
            this.value = value;
        }

        public Node<E> getLeft() {
            return this.leftChild;
        }

        public Node<E> getRight() {
            return this.rightChild;
        }

        public E getValue() {
            return this.value;
        }
    }

    public void eachInOrder(Consumer<E> consumer) {
        nodeInOrder(this.root, consumer);
    }

    private void nodeInOrder(Node<E> root, Consumer<E> consumer) {
        if (root == null){
            return;
        }
        nodeInOrder(root.getLeft(), consumer);
        consumer.accept(root.getValue());
        nodeInOrder(root.getRight(), consumer);
    }

    public Node<E> getRoot() {
        return this.root;
    }

    public void insert(E element) {
        if (this.root == null) {
            this.root = new Node<>(element);
        } else {
            insertElement(this.root, element);
        }

    }

    private void insertElement(Node<E> node, E element) {
        if (elementIsLess(node, element)) {
            insertElement(node.getLeft(), element);
            if (node.getLeft() == null) {
                node.leftChild = new Node<>(element);
            }
        } else if (elementIsGreater(node, element)) {
            insertElement(node.getRight(), element);
            if (node.getRight() == null) {
                node.rightChild = new Node<>(element);
            }
        }

    }

    private boolean isEqual(Node<E> node, E element) {
        return node.getValue().compareTo(element) == 0;
    }

    private boolean elementIsGreater(Node<E> node, E element) {
        return node.getValue().compareTo(element) < 0;
    }

    private boolean elementIsLess(Node<E> node, E element) {
        return node.getValue().compareTo(element) > 0;
    }

    public boolean contains(E element) {
        return false;
    }

    public BinarySearchTree<E> search(E element) {
        return null;
    }

    public List<E> range(E first, E second) {
        return null;
    }

    public void deleteMin() {

    }

    public void deleteMax() {

    }

    public int count() {
        return 0;
    }

    public int rank(E element) {
        return 0;
    }

    public E ceil(E element) {
        return null;
    }

    public E floor(E element) {
        return null;
    }
}
