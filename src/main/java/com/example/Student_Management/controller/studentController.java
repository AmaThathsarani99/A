package com.example.Student_Management.controller;
import com.example.Student_Management.model.student;
import com.example.Student_Management.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/students")
public class studentController {
 @Autowired
 private studentService studentService;
 @PostMapping
 public ResponseEntity<student> saveStudent(@RequestBody student
student) {
 return new ResponseEntity<>(studentService.saveStudent(student),
HttpStatus.CREATED);
 }
 @GetMapping
 public List<student> getAllStudents() {
 return studentService.getAllStudent();
 }
 @GetMapping("/{id}")
 public ResponseEntity<student> getStudentById(@PathVariable("id") long
studentId) {
 return new
ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
 }
 @PutMapping("/{id}")
 public ResponseEntity<student> updateStudent(@PathVariable("id") long
id, @RequestBody student student) {
 return new ResponseEntity<>(studentService.updateStudent(student,
id), HttpStatus.OK);
 }
 @DeleteMapping("/{id}")
 public ResponseEntity<String> deleteStudent(@PathVariable("id") long
id) {
 studentService.deleteStudent(id);
 return new ResponseEntity<>("Student deleted successfully",
HttpStatus.OK);
 }
}