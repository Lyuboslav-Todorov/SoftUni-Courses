package implementations;

import interfaces.AbstractBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BinaryTree<E> implements AbstractBinaryTree<E> {

    private E key;

    private BinaryTree<E> left;
    private BinaryTree<E> right;

    public BinaryTree(E key, BinaryTree<E> left, BinaryTree<E> right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    @Override
    public E getKey() {
        return this.key;
    }

    @Override
    public AbstractBinaryTree<E> getLeft() {
        return this.left;
    }

    @Override
    public AbstractBinaryTree<E> getRight() {
        return this.right;
    }

    @Override
    public void setKey(E key) {
        this.key = key;
    }

    @Override
    public String asIndentedPreOrder(int indent) {
        StringBuilder result = new StringBuilder();

        String padding = createPadding(indent) + this.key;
        result.append(padding);

        if (getLeft() != null) {
            String preOrder = this.getLeft().asIndentedPreOrder(indent + 2);
            result.append(System.lineSeparator()).append(preOrder);
        }

        if (getRight() != null) {
            String preOrder = this.getRight().asIndentedPreOrder(indent + 2);
            result.append(System.lineSeparator()).append(preOrder);
        }

        return result.toString();
    }

    private String createPadding(int indent) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < indent; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }

    @Override
    public List<AbstractBinaryTree<E>> preOrder() {
        return null;
    }

    @Override
    public List<AbstractBinaryTree<E>> inOrder() {
        return null;
    }

    @Override
    public List<AbstractBinaryTree<E>> postOrder() {
        return null;
    }

    @Override
    public void forEachInOrder(Consumer<E> consumer) {

    }
}