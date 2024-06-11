package edu.icet.demo.model.tableModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class CartTable {
    private String itemCode;
    private String description;
    private Integer qty;
    private Double unitPrice;
    private Double total;
}
