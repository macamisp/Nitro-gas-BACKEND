package com.gass.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "items")
public class ItemEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String weight;
    private String details;
    private String price;

}
