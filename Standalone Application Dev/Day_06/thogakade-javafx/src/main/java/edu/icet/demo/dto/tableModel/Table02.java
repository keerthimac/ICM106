package edu.icet.demo.dto.tableModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

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
