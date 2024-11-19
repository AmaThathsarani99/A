package com.example.Student_Management.service.impl;

import com.example.Student_Management.model.student;
import com.example.Student_Management.repository.studentRepository;
import com.example.Student_Management.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class studentServiceImpl implements studentService {
 @Autowired
 private studentRepository studentRepsitory;
 
 @Override
 public student saveStudent(student student){
 return studentRepsitory.save(student);
 }
 
 @Override
 public List<student> getAllStudent() {
 return studentRepsitory.findAll();
 }

 @Override
 public student getStudentById(long id) {
 Optional<student> employee = studentRepsitory.findById(id);
 if(employee.isPresent()){
 return employee.get();
 }else {
 throw new RuntimeException();
 }
 }
 
 @Override
 public student updateStudent(student student, long id) {
 student existingStudent =
studentRepsitory.findById(id).orElseThrow(
 ()-> new RuntimeException()
 );
 existingStudent.setFirstName(student.getFirstName());
 existingStudent.setLasttName(student.getLasttName());
 existingStudent.setEmail(student.getEmail());
 existingStudent.setDepartment(student.getDepartment());
 existingStudent.setYear(student.getYear());

 studentRepsitory.save(existingStudent);
 return existingStudent;
 }

 @Override
 public void deleteStudent(long id) {
 
 studentRepsitory.findById(id).orElseThrow(()-> new
RuntimeException());
 
 studentRepsitory.deleteById(id);
 }}