package com.crudapp.crudapp.controllers.student;

import com.crudapp.crudapp.model.Student;

import java.util.List;

public interface StudentController {

    List<Student> getAllStudents();

    void createStudent(String firstName, String lastName, String email);
}
