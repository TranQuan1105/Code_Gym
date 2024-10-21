package mvc_demo.code_gym_management.repository;

import mvc_demo.code_gym_management.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> readFromFile();
    boolean addStudent(Student student);
    boolean deleteStudent(int id);
    boolean updateStudent(Student student);
    Student getStudentById(int id);
}
