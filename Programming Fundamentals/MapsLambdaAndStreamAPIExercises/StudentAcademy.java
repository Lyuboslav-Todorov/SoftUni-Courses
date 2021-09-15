package MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsData = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentsData.putIfAbsent(studentName, new ArrayList<>());
            studentsData.get(studentName).add(grade);
        }

        studentsData.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    double firstAv = e1.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();

                    double secondAv = e2.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    return Double.compare(secondAv, firstAv);
                }).forEach(s -> {
                    double average = s.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    if (average >= 4.50){
                        System.out.printf("%s -> %.2f%n", s.getKey(), average);
                    }
                });

    }
}
