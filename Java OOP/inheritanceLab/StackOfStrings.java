package inheritanceLab;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;
    private int lastIndex;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String element) {
        this.data.add(element);
        lastIndex++;
    }

    public String peek() {
        return this.data.get(lastIndex - 1);
    }

    public String pop() {
        return this.data.remove(lastIndex-- -1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
