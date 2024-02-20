package com.example.studentteacher.Repository;

import com.example.studentteacher.Model.Student;
import com.example.studentteacher.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByStudentName(String studentName);



}
