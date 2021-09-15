package MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companies = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            companies.putIfAbsent(company, new ArrayList<>());
            if (!companies.get(company).contains(id)) {
                companies.get(company).add(id);
            }
            input = scanner.nextLine();
        }

        for (String company : companies.keySet()) {
            System.out.printf("%s%n", company);
            for (int i = 0; i < companies.get(company).size(); i++) {
                System.out.printf("-- %s%n", companies.get(company).get(i));
            }
        }
    }
}
