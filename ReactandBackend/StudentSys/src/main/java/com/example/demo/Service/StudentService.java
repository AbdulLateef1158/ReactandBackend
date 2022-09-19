package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
