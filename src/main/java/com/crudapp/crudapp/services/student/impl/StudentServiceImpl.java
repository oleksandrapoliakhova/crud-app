package com.crudapp.crudapp.services.student.impl;

import com.crudapp.crudapp.model.Student;
import com.crudapp.crudapp.repo.StudentRepository;
import com.crudapp.crudapp.services.student.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
