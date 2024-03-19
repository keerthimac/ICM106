package edu.icet.demo.service;

import edu.icet.demo.Student;

public class StudentService {
    public Student getStudent(){
        Student std = new Student();
        std.setName("Darshana");
        std.setAge("34");

        Student std2 = new Student("Pubudu","34");


        return std;

    }

}
