package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//Api Layer
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;


    @Autowired//Injection -> this.studentService = new StudentService()
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
        //comentario
        /*
        return List.of(
                new Student(
                        1L,
                        21,
                        "Maria",
                        "Maria@gmail.com",
                        LocalDate.of(2009, Month.APRIL,2)

                )
        );*/
    }
}
