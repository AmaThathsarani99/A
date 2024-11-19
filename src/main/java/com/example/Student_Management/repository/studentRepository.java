package com.example.Student_Management.repository;
import com.example.Student_Management.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student,Long> {
    
}
