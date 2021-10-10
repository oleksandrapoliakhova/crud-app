package com.crudapp.crudapp.services.student;

import com.crudapp.crudapp.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void createStudent(String firstName, String lastName, String email);

}
