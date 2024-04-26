package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "food")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer foodId;
    private String name;
    private String description;
    private String price;
    private boolean isStockAvailable;

}
