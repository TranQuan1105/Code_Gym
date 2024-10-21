package mvc_demo.code_gym_management.view;

import mvc_demo.code_gym_management.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Student student;
    Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        List<String> menu = Arrays.asList(
                "==========Student Management=========",
                "1. Add student",
                "2. Update student",
                "3. Delete student",
                "4. Search student",
                "5. Display student"
        );
        for (String option : menu) {
            System.out.println(option);
        }
        System.out.println("your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void displayStudent(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Nothing to show");
        } else {
            System.out.printf("%-5s %-15s %-15s %-15s%n", "Id", "Name", "Class Name", "Major");
            for (Student student : students) {
                System.out.printf("%-5d %-15s %-15s %-15s%n", student.getId(), student.getName(), student.getClassName(), student.getSubject());
            }
        }
    }
}
