package com.example.studentteacher.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String teacherName;
    String teacherSubject;

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    List<Student> studentList=new ArrayList<>();
}
