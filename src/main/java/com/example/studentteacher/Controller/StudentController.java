package com.example.studentteacher.Controller;

import com.example.studentteacher.DTOs.StudentRequestDTO;
import com.example.studentteacher.Model.Student;
import com.example.studentteacher.Model.Teacher;
import com.example.studentteacher.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentteacher")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
       studentService.addStudent(studentRequestDTO);
       return "success";
    }
   @PostMapping("/addTeacher")
   public String addTeacher(@RequestBody Teacher teacher){
       studentService.addTeacher(teacher);
       return "success";
    }

}
