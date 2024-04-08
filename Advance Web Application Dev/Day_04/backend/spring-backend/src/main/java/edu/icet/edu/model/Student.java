package edu.icet.edu.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class Student {
    private String firstName;
    private String lastName;
    private String province;
}
