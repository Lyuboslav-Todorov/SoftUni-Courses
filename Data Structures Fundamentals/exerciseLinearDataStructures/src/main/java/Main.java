import implementations.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast("1");
        arrayDeque.addLast("2");
        arrayDeque.addLast("3");

        arrayDeque.insert(1,"4");
        arrayDeque.insert(1,"5");
        arrayDeque.insert(1,"6");
        arrayDeque.insert(1,"7");
        arrayDeque.insert(1,"8");
        arrayDeque.insert(1,"9");
        arrayDeque.insert(1,"10");
        arrayDeque.insert(1,"11");
        arrayDeque.insert(1,"12");
        arrayDeque.insert(1,"13");
        arrayDeque.insert(1,"14");
        arrayDeque.insert(1,"15");
        arrayDeque.insert(1,"16");

        for (String s : arrayDeque) {
            System.out.println(s);
        }

    }
}
