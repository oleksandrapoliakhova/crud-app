package com.crudapp.crudapp.repo;

import com.crudapp.crudapp.model.Essay;
import org.springframework.data.jpa.repository.JpaRepository;

interface EssayRepository extends JpaRepository<Essay, Long> {
}

