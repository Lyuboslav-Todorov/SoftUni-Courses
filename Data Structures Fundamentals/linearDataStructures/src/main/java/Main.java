import implementations.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        for (String s : stack) {
            System.out.println(s);
        }

    }
}
