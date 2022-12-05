package implementations;

import interfaces.AbstractTree;

import java.util.*;
import java.util.stream.Collectors;

public class Tree<E> implements AbstractTree<E> {
    private E key;
    private Tree<E> parent;
    private List<Tree<E>> children;

    public Tree(E key, Tree<E>... children) {
        this.key = key;
        this.children = new ArrayList<>();
        for (Tree<E> child : children) {
            child.setParent(this);
            this.children.add(child);
        }
    }

    @Override
    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    @Override
    public void addChild(Tree<E> child) {
        this.children.add(child);
    }

    @Override
    public Tree<E> getParent() {
        return this.parent;
    }

    @Override
    public E getKey() {
        return this.key;
    }

    @Override
    public String getAsString() {
        StringBuilder builder = new StringBuilder();

        traverseTreeWIthRecursion(builder, 0, this);

        return builder.toString().trim();
    }

    private void traverseTreeWIthRecursion(StringBuilder builder, int indent, Tree<E> tree) {
        builder.append(this.getPadding(indent))
                .append(tree.getKey())
                .append(System.lineSeparator());

        for (Tree<E> child : tree.children) {
            traverseTreeWIthRecursion(builder, indent + 2, child);
        }
    }

    private String getPadding(int size) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }

    @Override
    public List<E> getLeafKeys() {
        List<E> leafs = new ArrayList<>();

        Deque<Tree<E>> queue = new ArrayDeque<>();

        queue.offer(this);

        while (!queue.isEmpty()) {
            Tree<E> currentTree = queue.poll();

            for (Tree<E> child : currentTree.children) {
                if (child.children.isEmpty()) {
                    leafs.add(child.getKey());
                } else {
                    queue.offer(child);
                }
            }
        }

        return leafs;
    }

    @Override
    public List<E> getMiddleKeys() {
        List<Tree<E>> result = new ArrayList<>();
        this.getAllNodesWithDFS(this, result);

        return result.stream().filter(n -> n.parent != null && n.children.size() > 0)
                .map(Tree::getKey)
                .collect(Collectors.toList());
    }

    private List<Tree<E>> getAllNodesWithDFS(Tree<E> tree, List<Tree<E>> result) {
        for (Tree<E> child : tree.children) {
            child.getAllNodesWithDFS(child, result);
        }
        result.add(tree);
        return result;
    }

    @Override
    public Tree<E> getDeepestLeftmostNode() {
        List<Tree<E>> trees = new ArrayList<>();
        this.getAllNodesWithDFS(this, trees);

        int maxPath = 0;

        Tree<E> deepest = this;

        for (Tree<E> tree : trees) {
            if (isLeaf(tree)) {
                int currentPath = getStepsFromLeafToRoot(tree);
                if (currentPath > maxPath) {
                    maxPath = currentPath;
                    deepest = tree;
                }
            }
        }

        return deepest;
    }

    private int getStepsFromLeafToRoot(Tree<E> tree) {
        int counter = 0;

        Tree<E> current = tree;

        while (current.parent != null) {
            current = current.parent;
            counter++;
        }

        return counter;
    }

    private boolean isLeaf(Tree<E> tree) {
        return tree.parent != null && tree.children.size() == 0;
    }

    @Override
    public List<E> getLongestPath() {
        List<E> longestPath = new ArrayList<>();
        Tree<E> deepestNode = this.getDeepestLeftmostNode();
        longestPath.add(deepestNode.getKey());
        Tree<E> currentParent = deepestNode.parent;

        while (currentParent != null) {
            longestPath.add(currentParent.getKey());
            currentParent = currentParent.parent;
        }

        Collections.reverse(longestPath);

        return longestPath;
    }

    @Override
    public List<List<E>> pathsWithGivenSum(int sum) {
        List<List<E>> paths = new ArrayList<>();
        List<Tree<E>> allTrees = new ArrayList<>();
        getAllNodesWithDFS(this, allTrees);

        for (Tree<E> tree : allTrees) {
            List<E> currentList = new ArrayList<>();
            int currentSum = 0;
            if (isLeaf(tree)) {
                Tree<E> currentTree = tree;
                while (currentTree != null){
                    currentList.add(0, currentTree.getKey());
                    currentSum += Integer.parseInt(String.valueOf(currentTree.getKey()));
                    currentTree = currentTree.parent;
                    if (currentSum == sum){
                        paths.add(currentList);
                    }
                }
            }
        }

        return paths;
    }


    @Override
    public List<Tree<E>> subTreesWithGivenSum(int sum) {
        return null;
    }
}



