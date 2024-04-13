package edu.icet.demo.service;

import edu.icet.demo.Student;

import java.util.ArrayList;

public class StudentService {
    public ArrayList<Student> getStudent(){

        Student std = new Student();
        std.setName("Darshana");
        std.setAge("34");

        Student std2 = new Student("Pubudu","34");

        ArrayList<Student> std3 = new ArrayList<>();

        std3.add(new Student("Pubudu","34"));
        std3.add(new Student("Pubudu","34"));
        std3.add(new Student("Pubudu","34"));
        std3.add(new Student("Pubudu","34"));



        return std3;

    }

}
