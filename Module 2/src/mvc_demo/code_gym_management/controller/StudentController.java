package mvc_demo.code_gym_management.controller;

import mvc_demo.code_gym_management.model.Student;
import mvc_demo.code_gym_management.service.IStudentService;
import mvc_demo.code_gym_management.service.StudentService;
import mvc_demo.code_gym_management.view.StudentView;

import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    Scanner scanner = new Scanner(System.in);
    private StudentView studentView = new StudentView();

    public void start() {
        while (true) {
            int choice = studentView.showMenu();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayStudents();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }

    public void addStudent() {
        System.out.println("enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter class name: ");
        String className = scanner.nextLine();
        System.out.println("enter subject: ");
        String subject = scanner.nextLine();
        studentService.addStudent(new Student(id, name, className, subject));
    }

    public void updateStudent() {
        System.out.println("Enter student ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name (leave blank if no change): ");
        String name = scanner.nextLine();
        System.out.println("Enter new class name (leave blank if no change): ");
        String className = scanner.nextLine();
        System.out.println("Enter new subject (leave blank if no change): ");
        String subject = scanner.nextLine();
        studentService.updateStudent(new Student(id, name, className, subject));
    }

    public void deleteStudent() {
        System.out.println("Enter student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!studentService.deleteStudent(id)) {
            System.out.println("Student not found.");
        }
    }

    public void searchStudent() {
        System.out.println("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        studentView.displayStudent(studentService.readFromFile());
    }


    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController();
        studentController.start();
    }
}
