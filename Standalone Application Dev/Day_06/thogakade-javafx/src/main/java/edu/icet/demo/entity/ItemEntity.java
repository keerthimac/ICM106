package edu.icet.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemEntity {
    private String itemCode;
    private String description;
    private String packSize;
    private Double UnitPrice;
    private Integer QtyOnHand;
}
