package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class CustomerEntity {
    public class FoodEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer cusId;
        private String cusName;
        private boolean isActiveCustomer;

    }
}
