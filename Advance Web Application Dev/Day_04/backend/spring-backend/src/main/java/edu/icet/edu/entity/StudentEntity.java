package edu.icet.edu.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer std_id;
    private String firstName;
//    @Column(name="sername")
    private String lastName;
    private String province;
}
