package com.example.demomvc.repository;

import com.example.demomvc.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
}
