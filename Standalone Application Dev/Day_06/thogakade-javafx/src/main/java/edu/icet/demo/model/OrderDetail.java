package edu.icet.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class OrderDetail {
    private String orderId;
    private String itemCode;
    private Integer qty;
    private Double discount;


}
