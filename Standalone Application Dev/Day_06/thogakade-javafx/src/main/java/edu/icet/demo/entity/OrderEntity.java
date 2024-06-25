package edu.icet.demo.entity;

import edu.icet.demo.dto.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class OderEntity {
    private String orderId;
    private Date orderDate;
    private String customerId;
    private List<OrderDetail> oderDetailList;
}
