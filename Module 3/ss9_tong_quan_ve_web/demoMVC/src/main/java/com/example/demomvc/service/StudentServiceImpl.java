package com.example.demomvc.service;

import com.example.demomvc.model.Student;
import com.example.demomvc.repository.IStudentRepository;
import com.example.demomvc.repository.StudentRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private final IStudentRepository iStudentRepository = new StudentRepositoryImpl();

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }
}
