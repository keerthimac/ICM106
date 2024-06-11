package edu.icet.model.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Table01TM {
    private String id;
    private String title;
    private String name;
    private LocalDate dob;
    private Double salary;

}
