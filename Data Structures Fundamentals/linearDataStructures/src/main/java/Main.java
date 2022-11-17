import implementations.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();

        queue.offer("test");
        queue.offer("name");
        queue.offer("name2");

        for (String s : queue) {
            System.out.println(s);
        }

    }
}
