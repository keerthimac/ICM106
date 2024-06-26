package edu.icet.demo.entity;

import edu.icet.demo.dto.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderEntity {
    private String orderId;
    private Date orderDate;
    private String customerId;
    private List<OrderDetailEntity> oderDetailList;
}
