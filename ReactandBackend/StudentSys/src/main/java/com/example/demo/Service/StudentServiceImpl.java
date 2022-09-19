package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentrepo;

    @Override
    public Student saveStudent(Student student) {
        return studentrepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {

        return studentrepo.findAll();
    }
}
