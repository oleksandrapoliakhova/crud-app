package com.crudapp.crudapp.controllers.student.impl;

import com.crudapp.crudapp.controllers.student.StudentController;
import com.crudapp.crudapp.model.Student;
import com.crudapp.crudapp.services.student.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentControllerImpl implements StudentController {

    private StudentService studentService;

    public StudentControllerImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    @GetMapping("/api/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
