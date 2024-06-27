package edu.icet.demo.dto.tableModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@ToString
public class Table01 {
    private String id;
    private String title;
    private String name;
    private LocalDate dob;
    private Double salary;
}
