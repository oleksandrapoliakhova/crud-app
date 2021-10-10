package com.crudapp.crudapp.services.student.impl;

import com.crudapp.crudapp.model.Student;
import com.crudapp.crudapp.repo.StudentRepository;
import com.crudapp.crudapp.services.student.StudentService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
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

    @Override
    public void createStudent(String firstName, String lastName, String email) {

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setStudentId(generateStudentId(firstName, lastName));

        studentRepository.save(student);
    }

    private String generateStudentId(String firstName, String lastName) {
        String generatedStudentId = "";
        if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(lastName)) {
            char character1 = firstName.charAt(0);
            char character2 = firstName.charAt(0);
            String generatedString = RandomStringUtils.randomNumeric(5);
            generatedStudentId = character1 + character2 + generatedString;
        }
        return  generatedStudentId;
    }
}
