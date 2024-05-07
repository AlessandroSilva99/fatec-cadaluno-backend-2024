package com.fatec.student.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.student.entities.Student;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
         
        Student s1 = new Student();
         s1.setId(1);
         s1.setName("Alessanndro");
         s1.setCourse("ADS");

    ArrayList<Student> Lista = new ArrayList<Student>();
    Lista.add(s1);

       return Lista;
    }
    }
    

