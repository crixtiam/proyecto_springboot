package com.example.demo.student;

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
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        21,
                        "Maria",
                        "Maria@gmail.com",
                        LocalDate.of(2009, Month.APRIL,2)

                )
        );
    }
}
