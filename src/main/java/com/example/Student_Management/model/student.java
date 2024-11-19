package com.example.Student_Management.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "student")


public class student {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
@Column(name= "first_name",nullable=false)
private String firstName;
@Column(name= "lastname",nullable=false)
private String lasttName;
@Column(name= "email_id",nullable=false)
private String email;
@Column(name="department",nullable=false)
private String Department;
@Column(name="yearOfEnrollement",nullable=false)
private String Year;






    
}
