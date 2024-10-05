package mvc_demo.student_manager.service;

import mvc_demo.student_manager.model.student;
import ss7_abstraction_tinhTruuTuong.Student;

import java.util.List;

public interface IStudentService {
    // quy định các phương thức CRUD
    List<student> findALl();
    void add(Student student);
}
