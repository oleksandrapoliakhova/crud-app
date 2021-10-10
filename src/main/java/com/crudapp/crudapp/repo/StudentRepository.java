package com.crudapp.crudapp.repo;

import com.crudapp.crudapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface StudentRepository extends JpaRepository<Student, Long> {
}

