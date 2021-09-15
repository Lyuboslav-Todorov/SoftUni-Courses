package MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(studentName);
            input = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((e1, e2) ->Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %s%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(student -> System.out.println("-- " + student));
                });

    }
}
