package edu.icet.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class Order {
    private String orderId;
    private Date orderDate;
    private String customerId;
    private List<OrderDetail> oderDetailList;

}
