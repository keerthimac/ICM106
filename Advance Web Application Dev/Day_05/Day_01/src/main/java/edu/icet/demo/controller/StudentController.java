package edu.icet.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.model.Student;
import edu.icet.demo.entity.StudentEntity;
import edu.icet.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ObjectMapper mapper;


    @PostMapping("/student")
    void saveStudent(@RequestBody Student student){
        System.out.println(student);

        StudentEntity studentEntity= mapper.convertValue(student, StudentEntity.class);

        //StudentEntity studentEntity = new StudentEntity();
        //studentEntity.setFirstName(student.getFirstName());
        //studentEntity.setLastName(student.getLastName());
        //studentEntity.setAge(student.getAge());

        studentRepository.save(studentEntity);
    }

    @GetMapping("/student")
    Iterable<StudentEntity> getStudent(Student student){
       return studentRepository.findAll();
    }
}
