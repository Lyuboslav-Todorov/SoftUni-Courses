package workingWithAbstractionLab.studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void parseCommand(String[] args) {

        String name = args[1];

        switch (args[0]) {
            case "Create":
                int age = Integer.parseInt(args[2]);
                double grade = Double.parseDouble(args[3]);
                createStudent(name, age, grade);
                break;
            case "Show":
                printStudentData(name, repo);
                break;
        }

    }

    private void printStudentData(String name, Map<String, Student> repo) {
        if (repo.containsKey(name)){
            Student student = repo.get(name);
            String view = String.format("%s is %s years old.", student.getName(), student.getAge());
            if (student.getGrade() >= 5.00){
                view += " Excellent student.";
            } else if (student.getGrade() >= 3.5){
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }
            System.out.println(view);
        }
    }

    private void createStudent(String name, int age, double grade) {
        repo.putIfAbsent(name, new Student(name, age, grade));

    }


}
