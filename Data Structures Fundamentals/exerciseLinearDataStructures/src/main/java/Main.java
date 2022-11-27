import implementations.ReversedList;

public class Main {
    public static void main(String[] args) {
        ReversedList<String> reversedList = new ReversedList<>();

        reversedList.add("Lyubo");
        reversedList.add("Vladi");
        reversedList.add("Bobo");


        System.out.println(reversedList.removeAt(1));

        for (String s : reversedList) {
            System.out.println(s);
        }
    }
}
