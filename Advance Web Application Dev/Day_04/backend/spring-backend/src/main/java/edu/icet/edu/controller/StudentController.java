package edu.icet.edu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.edu.repository.StudentReposotory;
import edu.icet.edu.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    StudentReposotory reposotory;

    ObjectMapper mapper;

    @PostMapping("/create-student")
    void createStudent(@RequestBody Student student){
        System.out.println(student);

    }
}
