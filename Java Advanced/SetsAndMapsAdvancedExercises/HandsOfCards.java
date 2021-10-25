package SetsAndMapsAdvancedExercises;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersCards = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")){
            String name = input.split(": ")[0];
            String cardsStr = input.split(": ")[1];
            String[] cardsArr = cardsStr.split(", ");
            Set<String> cardsSet = new HashSet<>();
            Collections.addAll(cardsSet, cardsArr);

            if (playersCards.containsKey(name)){
                Set<String> currentCards = playersCards.get(name);
                currentCards.addAll(cardsSet);
                playersCards.put(name,currentCards);
            } else {
                playersCards.put(name, cardsSet);
            }

            input= scanner.nextLine();
        }

        playersCards.entrySet().forEach(entry -> {
                    String name = entry.getKey();
                    Set<String> cards =  entry.getValue();
                    int points = getCardPoints(cards);
            System.out.printf("%s: %d%n", name, points);
                }
        );
    }

    private static int getCardPoints(Set<String> cards) {
        Map<Character, Integer> pointsMap = partOfCardValue();
        int sum = 0;
        for (String card: cards) {
            if (card.contains("10")){
                char type = card.charAt(2);
                sum += 10 * pointsMap.get(type);
            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                sum += pointsMap.get(power) * pointsMap.get(type);
            }
        }


        return sum;
    }


    public static Map<Character, Integer> partOfCardValue(){
        Map<Character,Integer> points = new HashMap<>();
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);
        return points;
    }

}
