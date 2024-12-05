package com.example.demomvc.service;

import com.example.demomvc.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
}
