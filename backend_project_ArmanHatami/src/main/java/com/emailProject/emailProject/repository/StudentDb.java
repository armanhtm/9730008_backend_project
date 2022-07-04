package com.emailProject.emailProject.repository;

import com.emailProject.emailProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDb extends JpaRepository<Student, Long> {
}
