package com.example.demomvc.repository;

import com.example.demomvc.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository {
    private static final List<Student> list;
    static {
        list = new ArrayList<>();
        list.add(new Student(1, "Hong Quan", true, 4));
        list.add(new Student(2, "Van Huy", true, 6 ));
        list.add(new Student(3, "Le Nam", true, 8));
        list.add(new Student(4, "Lan Chi", false, 8.5));
    }

    @Override
    public List<Student> findAll() {
        return list;
    }
}
