package edu.icet.demo.model.tableModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@ToString
public class Table02 {
    private String id;
    private String address;
    private String city;
    private String province;
    private String postal;
}
