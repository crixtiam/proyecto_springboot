package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//@Component
@Service
public class StudentService {
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
