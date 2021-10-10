package com.crudapp.crudapp.repo;

import com.crudapp.crudapp.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

interface GradesRepository extends JpaRepository<Grade, Long> {
}

