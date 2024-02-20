package com.example.studentteacher.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String studentName;
    int studentRlno;


    @ManyToOne
    @JoinColumn
    Teacher teacher;
}



