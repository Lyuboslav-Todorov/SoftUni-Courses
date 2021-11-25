
package workingWthAbstractionExercise.greedyTimes_06;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safeItems = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> itemsBag = new LinkedHashMap<>();
        long gold = 0;
        long stones = 0;
        long money = 0;

        for (int i = 0; i < safeItems.length; i += 2) {
            String name = safeItems[i];
            long amountOfTreasure = Long.parseLong(safeItems[i + 1]);

            String treasureName = "";

            if (name.length() == 3) {
                treasureName = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                treasureName = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                treasureName = "Gold";
            }

            if (treasureName.equals("")) {
                continue;
            } else if (bagCapacity < itemsBag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + amountOfTreasure) {
                continue;
            }

            switch (treasureName) {
                case "Gem":
                    if (!itemsBag.containsKey(treasureName)) {
                        if (itemsBag.containsKey("Gold")) {
                            if (amountOfTreasure > itemsBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (itemsBag.get(treasureName).values().stream().mapToLong(e -> e).sum() + amountOfTreasure > itemsBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!itemsBag.containsKey(treasureName)) {
                        if (itemsBag.containsKey("Gem")) {
                            if (amountOfTreasure > itemsBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (itemsBag.get(treasureName).values().stream().mapToLong(e -> e).sum() + amountOfTreasure > itemsBag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!itemsBag.containsKey(treasureName)) {
                itemsBag.put((treasureName), new LinkedHashMap<String, Long>());
            }

            if (!itemsBag.get(treasureName).containsKey(name)) {
                itemsBag.get(treasureName).put(name, 0L);
            }


            itemsBag.get(treasureName).put(name, itemsBag.get(treasureName).get(name) + amountOfTreasure);
            if (treasureName.equals("Gold")) {
                gold += amountOfTreasure;
            } else if (treasureName.equals("Gem")) {
                stones += amountOfTreasure;
            } else if (treasureName.equals("Cash")) {
                money += amountOfTreasure;
            }
        }

        for (var x : itemsBag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}