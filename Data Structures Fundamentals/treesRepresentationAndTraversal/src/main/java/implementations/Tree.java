package implementations;

import interfaces.AbstractTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Tree<E> implements AbstractTree<E> {
    private E key;
    private Tree<E> parent;
    private List<Tree<E>> children;


    public Tree(E key, Tree<E>... children) {
        this.key = key;
        this.children = new ArrayList<>();
        for (Tree<E> child : children) {
            this.children.add(child);
            child.parent = this;
        }

    }

    @Override
    public List<E> orderBfs() {
        List<E> result = new ArrayList<>();
        if (this.key == null){
            return result;
        }
        Deque<Tree<E>> queue = new ArrayDeque<>();
        queue.offer(this);
        while (queue.size() > 0) {
            Tree<E> current = queue.poll();
            result.add(current.key);
            for (Tree<E> child : current.children) {
                queue.offer(child);
            }
        }

        return result;
    }

    @Override
    public List<E> orderDfs() {
        List<E> result = new ArrayList<>();
        this.doDfs(this, result);
        return result;
    }

    private void doDfs(Tree<E> tree, List<E> result) {
        for (Tree<E> child : tree.children) {
            child.doDfs(child, result);
        }
        result.add(tree.key);
    }

    @Override
    public void addChild(E parentKey, Tree<E> child) {
        Tree<E> parent = findTree(parentKey);

        if (parent == null) {
            throw new IllegalArgumentException("There is no such key");
        }

        parent.children.add(child);
    }

    @Override
    public void removeNode(E nodeKey) {
        Tree<E> toRemove = findTree(nodeKey);

        if (toRemove == null) {
            throw new IllegalArgumentException("There is no such key");
        }

        for (Tree<E> child : toRemove.children) {
            child.parent = null;
        }

        toRemove.children.clear();

        Tree<E> parent = toRemove.parent;

        if (parent != null) {
            parent.children.remove(toRemove);
        }


    }

    private Tree<E> findTree(E nodeKey) {
        Deque<Tree<E>> queue = new ArrayDeque<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            Tree<E> current = queue.poll();
            for (Tree<E> child : current.children) {
                if (child.key.equals(nodeKey)) {
                    return child;
                }
                queue.offer(child);
            }
        }
        return null;
    }

    @Override
    public void swap(E firstKey, E secondKey) {

    }
}



