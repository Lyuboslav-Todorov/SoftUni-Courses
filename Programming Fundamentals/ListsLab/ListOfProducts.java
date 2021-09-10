package ListsLab;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<String> product = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String currentProduct = scanner.nextLine();
            product.add(currentProduct);
        }
        Collections.sort(product);
        for (int i = 0; i < lines; i++) {
            System.out.printf("%d.%s%n", i + 1, product.get(i));
        }
    }
}
