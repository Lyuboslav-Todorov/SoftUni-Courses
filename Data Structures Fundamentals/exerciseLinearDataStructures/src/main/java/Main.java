import implementations.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("1");
        arrayDeque.addFirst("2");
        arrayDeque.addFirst("3");
        arrayDeque.addFirst("4");
        arrayDeque.addFirst("5");
        arrayDeque.addFirst("6");
        arrayDeque.addFirst("7");
        arrayDeque.addFirst("8");
        arrayDeque.addFirst("9");
        arrayDeque.addFirst("10");
        arrayDeque.addFirst("11");
        System.out.println(arrayDeque.get(1));

    }
}
