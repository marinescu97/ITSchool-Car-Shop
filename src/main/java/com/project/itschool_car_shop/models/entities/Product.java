package com.project.itschool_car_shop.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "colour")
    private String colour;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "price")
    private double price;

    @Column(name = "year_of_manufacture")
    private Date yearOfManufacture;

    @Column(name = "discount", precision = 5, scale = 2, nullable = false)
    private BigDecimal discount;
}
