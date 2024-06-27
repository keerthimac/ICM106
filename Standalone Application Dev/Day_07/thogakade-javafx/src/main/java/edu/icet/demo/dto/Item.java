package edu.icet.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Item {
    private String itemCode;
    private String description;
    private String packSize;
    private Double UnitPrice;
    private Integer QtyOnHand;
}
