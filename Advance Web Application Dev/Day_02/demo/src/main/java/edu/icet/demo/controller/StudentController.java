package edu.icet.demo.controller;

import edu.icet.demo.Student;
import edu.icet.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    @GetMapping("/student")
    public ArrayList<Student>  getStudent() {
        StudentService service = new StudentService();
        ArrayList<Student> student = service.getStudent();
        System.out.println(student);
        return student;
    }
}
