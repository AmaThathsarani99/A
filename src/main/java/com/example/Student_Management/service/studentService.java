package com.example.Student_Management.service;
import com.example.Student_Management.model.student;
import java.util.List;

public interface studentService {
        student saveStudent(student student);
        List<student> getAllStudent();
        student getStudentById(long id);
        student updateStudent(student student,long id);
        void deleteStudent(long id);
       }
    

