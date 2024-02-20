package com.example.studentteacher.Service;

import com.example.studentteacher.DTOs.StudentRequestDTO;
import com.example.studentteacher.Model.Student;
import com.example.studentteacher.Model.Teacher;
import com.example.studentteacher.Repository.StudentRepository;
import com.example.studentteacher.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    public void addStudent(StudentRequestDTO studentRequestDTO){
        Student student = new Student();
        student.setStudentName(studentRequestDTO.getStudentName());
        student.setStudentRlno(studentRequestDTO.getStudentRlno());
        studentRepository.save(student);
   }
   public void addTeacher(Teacher teacher){
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherName(teacher.getTeacherName());
        teacher1.setTeacherSubject(teacher.getTeacherSubject());
        teacherRepository.save(teacher1);
   }


}
